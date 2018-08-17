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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
       this.reader=reader;
       this.dictionary=dictionary;
       
    }
    
    public void start(){
        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints it translation");
        System.out.println("    quit - quits the text user interface");
        
        
        while (true){
            System.out.println("");
            System.out.println("Statement: ");
            String input = reader.nextLine();
        if (input.equals("quit")){
            System.out.println("Cheers!");
            break;
        }
        else if (input.equals("add")){
            this.add();
            
        }
        else if (input.equals("translate")){
            this.translate();
        }
        else {
            System.out.println("Unknown statement");
        }
        }
        
    }
    
   public void add(){
        System.out.println("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.println("Translation: ");
        String english = reader.nextLine();
        this.dictionary.add(finnish, english);
    }
   
   public void translate(){
       System.out.println("Give a word: ");
       String key = reader.nextLine();
       
       String result = this.dictionary.translate(key);
       System.out.println("Translation: "+result);
       
   }
    
}
