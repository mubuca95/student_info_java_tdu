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
public class Student {
    
    public int Mr_Num;
    private String Name;
    private String Nachname;
    
    public Student(int nummer, String name,  String nachname){
        Mr_Num = nummer;
        Name = name;
        Nachname = nachname;
    }
    public Student(){
       
    }
    
    public int getNummer(){
        return Mr_Num;
    }
    
    public String getName(){
        return Name;
    }
    public String getNachname(){
        return Nachname;
    }
}
    

