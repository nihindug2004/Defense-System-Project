/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem2;

import java.util.ArrayList;


public class Observarble {
    private static Observarble instance;
    private ArrayList <Observer> arraylist = new ArrayList<>();
    public void addObservable (Observer obj){
        arraylist.add(obj);
    }
    
    public static Observarble getInstance(){
        if (instance == null) {
            return instance = new Observarble();           
        }
        return instance;
    }
    
    public void setAreaClear(int areavalue){
        for(Observer obj : arraylist){
            obj.setAreaClear(areavalue);
            
        }
    }
    
    public void setMassage(String msg){
        for(Observer obj : arraylist){
            obj.setMassage(msg);
            
        }
    }
    
    public void setBtnEnable(int btnvalue){
        for(Observer obj : arraylist){
            obj.setBtnEnable(btnvalue);
            
        }
    }
    
    public void setQuickAreaClear(boolean chavalue){
        for(Observer obj : arraylist){
            obj.setQuickAreaClear(chavalue);
            
        }
    }
    
}

    

