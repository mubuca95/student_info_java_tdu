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
public class LVA {
    private int lva_id;    
    private int gruppe_id;
    private int dozent_id;
    private String Name;
    
    public LVA(String name, int gruppe, int dozentID){ //constructor zum erstellen eines LVA objektes
        Name = name;        
        gruppe_id = gruppe;
        dozent_id = dozentID;
    }
    public LVA(String name,int LVAid, int gruppe, int dozentID){ //constructor zum erstellen eines LVA objektes
        Name = name;        
        gruppe_id = gruppe;
        dozent_id = dozentID;
        lva_id = LVAid;
    }
    public void setGruppe_ID(int group_id){
        gruppe_id = group_id;
    }    
    public int getGruppe_id(){
        return gruppe_id;
    }
            
    public int getLVAid(){
        return lva_id;
    }
     
    public String getLVAname(){
        return Name;
    }
    public int getDozent_ID(){
        return dozent_id;
    }
}
