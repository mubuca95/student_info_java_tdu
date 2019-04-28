/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std_verwaltung;
import java.lang.*; // if vectors are needed
import java.util.*;

/**
 *
 * @author user1
 */
public class STD_VERWALTUNG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBconnect connect = new DBconnect(); //Database Verbindung wird gesetzt 
        System.out.println("Std suche TEST !!!");   
        System.out.println(connect.get_StudentData(0).getName()+" "+connect.get_StudentData(0).getNachname());
        System.out.println("\n"+"\n");
        //System.out.println(connect.get_gruppe_id_gruppe_name("h1"));
        //System.err.println(connect.get_dozent_id_via_dozentname("Maria Müller"));
        STD_VERWALTUNG_GUI a = new STD_VERWALTUNG_GUI();
        a.setVisible(true);
        
        //System.out.println(connect.check_if_anw_date_exist("2018-05-07"));
         /*
        System.out.println("LVA insertation test !!!!"); 
        LVA ders = new LVA("Teknik_Almanca_tms",4,1);
        connect.insert_lva(ders);
        */
        
        
        //get_all_Student_data Test
        /*
        Vector <Integer> a = new Vector <Integer>();
        a.add(0); 
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        Vector <Student> s = new Vector <Student>();
        s = connect.get_all_StudentData(a);               
        for(int c = 0; c < s.size(); c++){
            Student b = s.get(c);
            System.out.println(b.getName()+" "+b.getNachname()+" "+b.getNummer());
        }
        */
        
       /*System.out.println(" Dozent Vector Test !!!!"); 
        Vector <Dozent> v = new Vector<Dozent>();
        v = connect.get_all_DozentData();
        for(int c = 0; c < v.size(); c++){
            Dozent a = v.get(c);
            System.out.println(a.getDozentName()+" "+a.getDozentNachname()+""+a.getDozent_ID());
        }
        */
        //System.out.println(connect.get_DozentData(0));
        //connect.insert_lva("genel_almanca_h12", "b1",1);
        
        /*
        System.out.println("GET LVA_ID's TEST !!");
        int a = 0; // in diesem Fall dozent_id
        Vector<LVA> v = new Vector<LVA>();
       
        for(int c = 0; c < connect.get_lva(a).size(); c++ ){
            v.add(connect.get_lva(a).elementAt(c));
        }
        for(int c = 0; c < v.size(); c++){
            System.out.println(v.elementAt(c).getLVAname());
        }
        */
        /*
        System.out.println("GET GRUPPE TEST !!");
        System.out.println(connect.get_gruppe(1).get_gruppe_name());
        */
        
        /*
         System.out.println("GET STD_ID FROM GRUPPE TEST !!");
         System.out.println(connect.get_student_id_from_gruppe(0).elementAt(0));
         System.out.println(connect.get_student_id_from_gruppe(0).elementAt(1));
         System.out.println(connect.get_student_id_from_gruppe(0).elementAt(2));
         *//*
         System.out.println("GET STD INFO FROM GRUPPE TEST !!");
         Vector <Student> std_inf = new Vector<Student>();
         std_inf = connect.get_all_StudentData(connect.get_student_id_from_gruppe(0));
         System.out.println(std_inf.size());
         for(int c = 0; c < std_inf.size(); c++){                    
            System.out.println(std_inf.elementAt(c).getName()+" "+std_inf.elementAt(c).getNachname());
         } */        
        /*
         System.out.println("SET ANWESENHEITSDATA TEST !!");
        
         Anwesenheit m = new Anwesenheit(0,"2018-05-12",1,true);
         connect.set_anwesenheit(m);
         m = new Anwesenheit(0,"2018-05-12",2,true);
         connect.set_anwesenheit(m);
         */
         
        
    }
    
   
    
}
