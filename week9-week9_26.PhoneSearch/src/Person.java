
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class Person {
    private String name;
    private String address;
    private Set<String> phonenumber;
    
    public Person(String name){
        this.name=name;
        this.phonenumber=new HashSet<String>();
        this.address="";
    }
    
    public void addAddress(String address){
        this.address=address;
    }
    
    public void addPhoneNumber(String phoneNumber){
        this.phonenumber.add(phoneNumber);
    }
    
    public void printAddress(){
        if (this.address.isEmpty()){
            System.out.println("  address unknown"); 
        }
        else{
            System.out.println("  address: "+this.address);
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public Set<String> getNumbers(){
        return this.phonenumber;
    }
    
    public boolean containsNumber(String number){
        if (this.phonenumber.contains(number)){
            return true;
        }
        else return false;
    }
    
    public void printNumbers(){
        
        if (!(this.phonenumber.isEmpty())){
            System.out.println("  phone numbers:");
        
            for (String number : this.phonenumber){
                System.out.println("  "+number);
            }
            
            }
        else{
            System.out.println("  phone number not found");
        }
    }
    
    public boolean containsKeyword(String keyword){
        if (this.address.contains(keyword) || this.name.contains(keyword)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
