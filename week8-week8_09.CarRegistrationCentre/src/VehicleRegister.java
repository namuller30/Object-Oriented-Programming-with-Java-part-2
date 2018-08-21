/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
import java.util.*;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners= new HashMap<RegistrationPlate,String>();
    }


    public boolean add(RegistrationPlate plate, String owner){
        if (!this.owners.containsKey(plate)){
            this.owners.put(plate, owner);
            return true;
        }
        else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            return this.owners.get(plate);
        }
        else{
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        }
        else {
            return false;
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerNames = new ArrayList<String>();
        for (RegistrationPlate plate : this.owners.keySet() ){
            
            if (!ownerNames.contains(this.owners.get(plate))){
                ownerNames.add(this.owners.get(plate));
                System.out.println(this.owners.get(plate));
            }
            
        }
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : this.owners.keySet() ){
            System.out.println(plate);
        }
        
    }
}
    

