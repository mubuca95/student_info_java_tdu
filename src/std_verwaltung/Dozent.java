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
public class Dozent {
    public int Dozent_ID;
    private String Name;
    private String Nachname;
    
    public Dozent(int n1, String n2, String n3) {
        Dozent_ID = n1;
        Name = n2;
        Nachname = n3;
    }
    
    public int getDozent_ID(){
        return Dozent_ID;
    }
    
    public String getDozentName(){
        return Name;
    }
    public String getDozentNachname(){
        return Nachname;
    }
    
}
