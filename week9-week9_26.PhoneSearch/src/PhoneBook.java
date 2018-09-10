

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class PhoneBook {
    private HashMap<String,Person> phoneBook;
    
    public PhoneBook(){
        this.phoneBook= new HashMap<String,Person>();
    }
    
    public void addPerson(Person person){
        if (!(this.phoneBook.containsKey(person.getName()))){
            this.phoneBook.put(person.getName(), person);
        }
    }
    
    public boolean containsPerson(String name){
        if (this.phoneBook.containsKey(name)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Person getPerson(String name){
        return this.phoneBook.get(name);
    }
    
    public String getPersonbyNumber(String number){
        String nameReturn="";
        for (String name : this.phoneBook.keySet()){
            Person person = phoneBook.get(name);
            if (person.containsNumber(number)){
                nameReturn=person.getName();
            }
        }
        return nameReturn;
        
    }
    
    public void removePerson(String name){
        if (this.phoneBook.containsKey(name)){
            this.phoneBook.remove(name);
        }
    }
    
    public void printKeyword(String keyword){
        SortedSet<String> keys = new TreeSet<String>(this.phoneBook.keySet());
        if (keyword.isEmpty()){
            for (String name : keys){
            Person person = phoneBook.get(name);
            System.out.println(" "+person.getName());
            person.printAddress();
            person.printNumbers();
            }
        }
        else {
            boolean morethanone=false;
            for (String name : keys){
            Person person = phoneBook.get(name);
            if (person.containsKeyword(keyword)){
                System.out.println("");
                System.out.println(" "+person.getName());
                person.printAddress();
                person.printNumbers();
                morethanone=true;
            }
            }
            if (!morethanone){
                System.out.println(" keyword not found");
            }
        }
        
    }
    
    
}
