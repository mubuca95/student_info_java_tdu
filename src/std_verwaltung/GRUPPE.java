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
public class GRUPPE {
    private int gruppe_id;
    private String gruppe_name;
    
    public GRUPPE(int id, String Name){
        gruppe_id = id;
        gruppe_name = Name;
    }
    public int get_gruppe_id(){
        return gruppe_id;
    }
    public String get_gruppe_name(){
        return gruppe_name;
    }
    
    
}
