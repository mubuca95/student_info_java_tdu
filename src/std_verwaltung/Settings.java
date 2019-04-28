/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std_verwaltung;

/**
 *
 * @author user1
 */
public class Settings {
    
   private String DB_url;
   private int gesamt_stunde;
   private int gesamt_woche;
   
   public Settings(int stunde_anzahl){
       gesamt_stunde = stunde_anzahl;
    }
   public int get_gesamt_stunde(){
       return gesamt_stunde;
   }
   public int get_gesamt_woche(){
       return gesamt_woche;
   }
}
