
package std_verwaltung;
import java.sql.*;
import java.lang.*; // if vectors are needed
import java.util.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Mustafa Burak Çakmak
 */
public class DBconnect {
    
     
    private Connection connect = null; 
    private Statement statement = null; //objekt,damit sql befehle geliefert wird.
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null; //beinhaltet data, das aus database abgerufen wird. 
    private String url = "jdbc:mysql://localhost:3306/software_project"; //driver url(localhost,weil db sich in gleichen PC befindet)
    private String username = "root";
    private String password = "123456";
    public  String connection_sucessfull = "DB Connection is sucessfull" ;
    public boolean connection_state = true;
    public DBconnect(){             //constructor für DB Verbindung.Hier wird connection objeckt erstellt 
        try{
            Class.forName("com.mysql.jdbc.Driver");                       
            connect = DriverManager.getConnection(url,username,password); //verbindung wird hergestellt   
            statement = connect.createStatement();                //Befehl verbindung für mySQL wird eingestellt
            String query = "SET SQL_SAFE_UPDATES = 0";
            statement.executeQuery(query);
        }catch(Exception ex){
            System.out.println("Error:"+ex);
            connection_sucessfull = "Error:"+ex;
            connection_state = false;
        }
    }
    
    public String get_con_state(){
    return connection_sucessfull;
    }
    
    public boolean check_if_anw_date_exist(String Datum){        
        boolean exists;
        String query = "select *from anwesenheit2schueler where datum='"+Datum+"'";
        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                return true;
            }
        } catch (Exception ex) {
            System.out.println("std_verwaltung.DBconnect.check_if_anw_date_exist() ERROR"+ ex);
            return false;
        }
        return false;        
    }
    
    
    
    
/*
    public void getData_example(){
        try{
            String  query = "select * from schueler";
            resultSet =statement.executeQuery(query);          //Befehl wird in SQL ausgeführt
            System.out.println("Records from Database");
            while(resultSet.next()){
                int nummer = resultSet.getInt("std_id");
                String name = resultSet.getString("std_name");
                String nachname = resultSet.getString("std_nachname");
                System.out.println("Mr. No = " +nummer+" Name : "+ name+ " nachname :" +nachname);
             }                    
            }catch(Exception ex){
               System.out.println("GET DATA ERROR:"+ ex);
            }
    }
*/
    public Student get_StudentData(int mr_nummer){    //Gibt Student Name und Nachname als ein Student Objekt
        Student Student1 = new Student();
        try{            
             String query = "select std_name,std_nachname from schueler where std_id = "+mr_nummer ;
             resultSet =statement.executeQuery(query);            
              while(resultSet.next()){                 
              Student1 = new Student(mr_nummer,resultSet.getString("std_Name"),resultSet.getString("std_Nachname"))   ;                               
              return Student1 ;
              }            
        }catch(Exception ex){
               System.out.println("GET STUDENT DATA ERROR:"+ ex);               
             }    
        return Student1;
    }
    
    
    public Vector<Student> get_all_StudentData_final(){
        Vector<Student> v_s = new Vector<Student>();
        Student s;
        String  query = "select *from schueler";
        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                s = new Student(resultSet.getInt("std_id"), resultSet.getString("std_name"), resultSet.getString("std_nachname"));
                v_s.add(s);
            }
        } catch (Exception e) {
            System.out.println("get_all_studentData error");
        }
        return v_s;
    }
    
    public Vector<Student> get_all_StudentData(Vector<Integer> mr_nummer){  // Gibt Data aller Studenten nach mr_nummer als ein Vector zurück *** ERROR Solved ****(08.05)
        Vector<Student> Student_all = new Vector<Student>();
       try{
            for(int c = 0; c < mr_nummer.size(); c++ ){
                Student_all.add(get_StudentData(mr_nummer.get(c)));               
            }
            return Student_all;
        }catch(Exception ex){
            System.out.println("GET ALL STUDENT DATA ERROR:"+ ex);
        }
        
          /*Student Student1 = new Student();
          try{            
             for(int c = 0; c < mr_nummer.capacity(); c++){
                String query = "select std_name,std_nachname from schueler where std_id = "+mr_nummer.elementAt(c) ;
                resultSet =statement.executeQuery(query);
                while(resultSet.next()){                 
                    Student1 = new Student(mr_nummer.elementAt(c),resultSet.getString("std_Name"),resultSet.getString("std_Nachname"))   ;    
                    Student_all.add(Student1);
                    }
                }
             return Student_all;
             }catch(Exception ex){
                System.out.println("GET ALL STUDENT DATA ERROR:"+ ex);
             }*/
        return Student_all;
    }
    
    
     public Dozent get_DozentData(int dozent_id){ //Gibt Dozent Name und Nachname als ein Dozent Objekt nach Dozent_id
        Dozent dozent1 = new Dozent(-1,null,null);
        dozent1 = null;
         try{
        String query = "select dozent_name,dozent_nachname from dozent where dozent_id = "+dozent_id ;
        resultSet =statement.executeQuery(query);
         while(resultSet.next()){                 
                dozent1 = new Dozent(dozent_id,resultSet.getString("dozent_Name"),resultSet.getString("dozent_Nachname"));
                return dozent1;
             }                         
        }catch(Exception ex){
                System.out.println("GET DOZENT DATA ERROR"+ex);
            }
         return dozent1;
     }
     
     public  Vector<Dozent>  get_all_DozentData(){    //Gibt Dozent Name und Nachname als ein Vector,das aus Dozent Objekten besteht.
        Dozent dozent1 = new Dozent(-1,null,null);
        dozent1 = null;
        Vector<Dozent> vec = new Vector<Dozent>();
        try{
        String query = "select dozent_id,dozent_name,dozent_nachname from dozent" ;
        resultSet =statement.executeQuery(query);
         while(resultSet.next()){                 
                dozent1 = new Dozent(resultSet.getInt("dozent_id"),resultSet.getString("dozent_Name"),resultSet.getString("dozent_Nachname"));
                vec.add(dozent1);
             }                         
        }catch(Exception ex){
                System.out.println("GET DOZENT DATA ERROR"+ex);
            }
         return vec;
     }
  
    
     public Vector<LVA> get_lva(int a){ //Gibt LVA's zurück, die zum/-r bestimmten Dozent gehört.
        Vector<LVA> v = new Vector<LVA>();
        LVA lva = null;
        try{
            String query = "select *from lva where dozent_id ="+a;
            resultSet =  statement.executeQuery(query);
            while(resultSet.next()){
                lva = new LVA(resultSet.getString("lva_name"),resultSet.getInt("lva_id"),resultSet.getInt("gruppe_id"),resultSet.getInt("dozent_id"));
                v.add(lva);                
                }
            }catch(Exception ex){
            System.out.println("GET_LVA_ID ERROR !"+ex);
        }
     return v;
     }
       
     /*
     //Gibt LVA Objekt Vector je nach lva_id  WARTET GETESTED ZU WERDEN
     public Vector<LVA> get_lva_data(Vector<Integer> a){
         Vector<LVA> v = new Vector<LVA>(null);
         try{          
             for(int c=0; c < a.capacity();c++){
                String query = "select *from lva where lva_id ="+a.elementAt(c);
                resultSet =  statement.executeQuery(query);
                while(resultSet.next()){
                    LVA lva = new LVA(resultSet.getString("lva_name"),a.elementAt(c),resultSet.getInt("gruppe_id"),resultSet.getInt("dozent_id")); 
                    v.add(lva);
                    }
                }
         }catch(Exception ex){
             System.out.println("get_lva_data Error !!!");
            }
         return v;
     }  
    */
    public Vector<LVA> get_all_lva(){ //Gibt alle LVA's, die DB enthaelt, zurück ! 
        Vector<LVA> v = new  Vector<LVA>();
        LVA lva;
        try{
            String query = "select *from lva";
            resultSet =  statement.executeQuery(query);
            while(resultSet.next()){
                lva = new LVA(resultSet.getString("lva_name"),resultSet.getInt("lva_id"),resultSet.getInt("gruppe_id"),resultSet.getInt("dozent_id"));
                v.add(lva);                
                }
            }catch(Exception ex){
            System.out.println("GET_LVA_ID ERROR !"+ex);
        }
        return v;
    }   
      public Vector<LVA> get_all_lva_dozent_id(int dozent_id){
      Vector<LVA> v = new  Vector<LVA>();
        LVA lva;
        try{
            String query = "select *from lva where dozent_id ="+dozent_id;
            resultSet =  statement.executeQuery(query);
            while(resultSet.next()){
                lva = new LVA(resultSet.getString("lva_name"),resultSet.getInt("lva_id"),resultSet.getInt("gruppe_id"),resultSet.getInt("dozent_id"));
                v.add(lva);                
                }
            }catch(Exception ex){
            System.out.println("GET_LVA_ID ERROR !"+ex);
        }
        return v;        
      }
    
    public void insert_lva(LVA a){   //Erstellen einer LVA, eingabe ist ein Objekt, dessen Typ ein LVA ist. 
        try{
            String query = "insert into lva(lva_name,gruppe_id,dozent_id)values('"+a.getLVAname()+"','"+a.getGruppe_id()+"','"+a.getDozent_ID()+"')";
            statement.execute(query);
        }catch(Exception ex){
        System.out.println("INSERTATION ERROR !!!"+ex);
        }
    }

    public void delete_lva(int lva_id){ //Löschen einer LVA 
        try{
            String query = "DELETE FROM LVA WHERE lva_id ="+Integer.toString(lva_id);
            statement.execute(query);
        }catch(Exception ex){
            System.out.println("DELETE LVA ERROR"+ex);
        }
    }
   public GRUPPE get_gruppe(int gruppe_id){
        GRUPPE gruppe = null;
        try{
            String query = "select  *from gruppe where gruppe_id ="+gruppe_id;
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                gruppe = new GRUPPE(gruppe_id, resultSet.getString("gruppe_name"));
            }
            return gruppe;
        }catch(Exception ex){
            System.err.println("GET_GRUPPE ERROR! " +ex);
        }
   return gruppe;
   }
   
   public Vector<GRUPPE> get_all_gruppe(){
       GRUPPE gruppe = null;
       Vector<GRUPPE> v = new Vector<GRUPPE>();
        try{
            String query = "select  *from gruppe";
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                gruppe = new GRUPPE(resultSet.getInt("gruppe_id"), resultSet.getString("gruppe_name"));
                v.add(gruppe); 
            }
            return v;
        }catch(Exception ex){
            System.err.println("GET_GRUPPE ERROR! " +ex);
        }
   return v;
       
   }
   
   public int get_gruppe_id_lva_id(int lva_id){
       int a = 789456123;
       try{
          String query = "select gruppe_id from lva where lva_id ="+lva_id;
          resultSet = statement.executeQuery(query);
          while(resultSet.next()){
              a = resultSet.getInt("gruppe_id");
          }
       }catch(Exception ex){
           System.out.println("GET_GRUPPE_ID ERROR! "+ex );
        }
       return a;
   }
   
   public Vector<Integer>get_student_id_from_gruppe(int gruppe_id){
       Vector<Integer> v = new Vector<Integer>();
       try{
           String query = "select std_id from schueler2gruppe where gruppe_id="+gruppe_id;
           resultSet = statement.executeQuery(query);
           while(resultSet.next()){
               v.add(resultSet.getInt("std_id"));
            }
            return v;
       }catch(Exception ex){
           System.out.println("GET_STUDENT_ID_FROM_GRUPPE ERROR"+ex);
       }
       return v;
   }
   //not tested yet !!! 02.05 
   public String set_anwesenheit(Anwesenheit m){ //erstellt eine Reihe fürs Anwesenheitsdata in DB(anw2schueler table)
        String str = "Erfolgreich Hinzugefügt";
        try{
            String query = "INSERT INTO ANWESENHEIT2SCHUELER(std_id,Datum,lva_Stunde,anw_Status)VALUES('"+m.get_std_id()+"','"+m.get_Date()+"','"+m.get_lva_stunde()+"',"+m.get_anw_status()+")";
            statement.execute(query);
            str = str + m.get_Date().toString();
        }catch(Exception ex){           
            System.out.println("SET_ANWESENHEIT FEHLER!"+ex);
            str = "SET_ANWESENHEIT FEHLER!"+ex;
        }
        if(m.get_Date().toString().equals("1970-01-01")){
            str = "Date Error!";            
        }        
        return str;
    }
    public String update_anwesenheitstable(Anwesenheit m){
        String date = m.get_Date();
        int mr_nummer = m.get_std_id();
        int lva_stunde = m.get_lva_stunde();
        int anw_state = m.get_anw_status();
        String str = "Erfolgreich Hinzugefügt !";
        String query = "update anwesenheit2schueler set anw_status ='"+anw_state+"'where std_id ='"+mr_nummer+"'and datum ='"+date+"'and lva_stunde ='"+lva_stunde+"'";
            try {
            statement.execute(query);
            str = str + m.get_Date();
        } catch (Exception e) {
                System.out.println("std_verwaltung.DBconnect.update_anwesenheitstable()"+ e);
                str = "SET_ANWESENHEIT FEHLER!"+e;                
        }
        if(m.get_Date().equals("1970-01-01")){
        str = "Date Error!" ;            
        }
        return str;
    }
   
    public Vector<Anwesenheit> get_anwesenheit_mr_nummer_date(int mr_nummer,String date){
        Vector<Anwesenheit> v_a = new Vector<Anwesenheit>();
        Anwesenheit a;
        try{
            String query = "Select *from anwesenheit2schueler where std_id ="+mr_nummer+" and datum= '"+date+"'";
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                a = new Anwesenheit(mr_nummer, date, resultSet.getInt("lva_stunde"), resultSet.getBoolean("anw_status"));
                v_a.add(a);
            }
            }catch(Exception ex){
                System.out.println("std_verwaltung.DBconnect.get_anwesenheit_mr_nummer_date() ERROR"+ex);    
            }
        //System.out.println();
        return v_a;
    }
   
   
    public Vector<Anwesenheit> get_all_anwesenheit_of_a_student(Vector<Integer> std_id, String Date){ //noch nicht benutzt
        Vector<Anwesenheit> v_a = null;
        Anwesenheit a;
        try{
           for(int c = 0; c < std_id.size() ; c++ ){
            String query = "select *from anwesenheit2schueler where std_id ="+std_id.elementAt(c)+"and datum = '"+Date+"'";
           resultSet = statement.executeQuery(query);
           while(resultSet.next()){
               a = new Anwesenheit(std_id.elementAt(c), resultSet.getDate("datum").toString(), resultSet.getInt("lva_stunde"), resultSet.getBoolean("connection_state"));
               v_a.add(a);
               }
            }            
        }catch(Exception ex){
            System.out.println("get_all_anwesenheit(Vector<Integer> std_id)"+ex);
        }
        return v_a;
    }
    public int anwesenheit_sum(int student_id){
       int sum = 0;
       try{
           String query = "select count('anw_status') as sum from anwesenheit2schueler where anw_status = 0 and std_id ="+student_id;
           resultSet = statement.executeQuery(query);
           while(resultSet.next()){
           sum = resultSet.getInt("sum");
           }
       }catch(Exception ex){
           System.err.println("Anwesenheit_sum ERROR !"+ex );
       }
       return sum;
               
   }
    public void truncate_anwesenheit_table(){
        try{
            String query = "truncate table anwesenheit2schueler";
            statement.execute(query);
        }catch(Exception ex){
            System.out.println("truncate anwesenheit_table ERROR"+ex);
        }
    
    }
    public void delete_selected_anwdata(String Date){
        try{
            String query = "delete from anwesenheit2schueler where datum='"+Date+"'";
            statement.execute(query);            
        }catch(Exception ex){
            System.out.println("std_verwaltung.DBconnect.delete_selected_anwdata() ERROR :"+ex);
        }
    }
    
    public int get_gesamte_lehrstunde(){
        int gesamt_lehrstunde = 1;       
        try{
            String query = " select hour_number from settings";
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                gesamt_lehrstunde = resultSet.getInt("hour_number");
            }
        }catch(Exception ex){
            System.out.println("std_verwaltung.DBconnect.get_gesamte_lehrstunde() ERROR "+ex);
        }
       return gesamt_lehrstunde;
    }
    
    public void update_gesamte_lehrstunde(int i){    
            try{
            String query = "update settings set hour_number = "+i;
            statement.execute(query);           
        }catch(Exception ex){
            System.out.println("Update lehrstunde error! "+ex);
        }        
    }
    
    
    
 /*  public int get_gruppe_id_gruppe_name(String s){
       int a = 1453;
       try{
           String query = "SELECT GRUPPE_ID FROM GRUPPE WHERE GRUPPE_NAME ='"+s+"'";
           resultSet = statement.executeQuery(query);
           while(resultSet.next()){
           a = resultSet.getInt("gruppe_id");}
       }catch(Exception ex){
           System.out.println("GET GRUPPE ID FEHLER!"+ex);           
       }
       return a;
   }
 */
   
 /*  public int get_dozent_id_via_dozentname(String s){
       int a = 1071;
       String splitted[] = s.split("\\s+");
       try{
           String query ="SELECT DOZENT_ID FROM DOZENT WHERE DOZENT_NAME ='"+splitted[0]+"' AND DOZENT_NACHNAME ='"+splitted[1]+"'";  
           resultSet = statement.executeQuery(query);
           while(resultSet.next()){
               a = resultSet.getInt("dozent_id");
           }
       }catch(Exception ex){
           System.out.println("get_dozent_id_via_dozentname ERROR"+ ex);
       }
       return a;
   }
*/
   /*
   public int get_lva_id_via_lva_name(String s,int dozent_code){
       int a = 199995;
      
       try{
           String  query = "SELECT LVA_ID FROM LVA WHERE LVA_NAME='"+s+"' and dozent_id ='"+dozent_code+"'";
           resultSet = statement.executeQuery(query);
           a = resultSet.getInt("lva_id");
       }catch(Exception ex){
           System.out.println("get_lva_id_via_lva_name ERROR!"+ex);
       }
        return a;
    }
*/      
}

