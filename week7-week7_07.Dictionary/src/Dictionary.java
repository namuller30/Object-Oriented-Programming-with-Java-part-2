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

public class Dictionary {
    private HashMap<String,String> dictionary;
    
    public Dictionary(){
        this.dictionary=new HashMap<String,String>();
    }
    
    public String translate(String word){
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        int counter=0;
        for (String key : this.dictionary.keySet() ){
            counter++;
        }
        return counter;
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : this.dictionary.keySet()){
            translations.add(""+key+" = "+this.dictionary.get(key));
        }
        return translations;
    }
}
