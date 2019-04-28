
package std_verwaltung;
import java.util.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * @author user1
 */
public class Anwesenheit {
     private int summe;
     private int std_id;
     private String datum;
     public  int lva_stunde;
     public boolean anw_status;
    
     public Anwesenheit(int stdID,String date,int lvastunde,boolean anwstate){
         std_id = stdID;
         datum = date;
         anw_status = anwstate;
         lva_stunde = lvastunde;
         /*
         if(anwstate == 1){
         anw_status = true;}
         else{
         anw_status = false;
         ]
         */
         
        }
     public String get_Date(){
         return datum;
     }
     //sql date formatter falls gebraucht !
     /*public java.sql.Date get_anw_Date(){
         java.sql.Date sqlDate = new java.sql.Date(0000-00-00);
         try{
         SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-DD");
         java.util.Date util_date = sdf1.parse(datum);
         sqlDate = new java.sql.Date(util_date.getTime());         
         return sqlDate;
                 }catch(Exception ex){
                     System.out.println("SQL DATE ERROR"+ ex);
                 }
         return sqlDate;
        }
     */
      public int get_std_id(){
        return std_id;
        }
      
       public int get_anw_status(){
        if(anw_status)
            return 1;
        else
            return 0;
        }
       
        public int getAnwesenheit(){
        return summe;
        }     
        
        public int get_lva_stunde(){
        return lva_stunde;
        }
        
        public void setAnwesenheit(int a){
        summe = a ;
        }
        
        public boolean get_anw_boolean(){
            return anw_status;
        }
    
}
