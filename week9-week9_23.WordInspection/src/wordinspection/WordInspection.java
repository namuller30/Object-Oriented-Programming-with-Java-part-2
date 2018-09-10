/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ninja
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) throws FileNotFoundException{
        this.file=file;
    }
    
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        int words=0;
        while (reader.hasNext()){
            words+=1;
            reader.next();
        }
        return words;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        List<String> words = new ArrayList<String>();
        while (reader.hasNext()){
            String word = reader.next();
            if (word.contains("z")){
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        List<String> wordList = new ArrayList<String>();
        while (reader.hasNext()){
            String word = reader.next();
            if (word.charAt(word.length()-1)=='l'){
                wordList.add(word);
            }
        }
        return wordList;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        List<String> palindromes = new ArrayList<String>();
        while (reader.hasNext()){
            int front=0;
            int back=1;
            String word=reader.next();
            boolean isPal=false;
            while (true){
                if (!(word.charAt(front)==word.charAt(word.length()-back))){
                    break;
                }
                front++;
                back++;
                if(front>word.length()/2){
                    isPal=true;
                    break;
                }
            }
            
            if (isPal){
                palindromes.add(word);
            }
            
        }
        return palindromes;   
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        List<String> words = new ArrayList<String>();
        while (reader.hasNext()){
            String word=reader.next();
            if (word.contains("a")&&word.contains("e")&&word.contains("i")&&word.contains("o")&&word.contains("u")&&word.contains("y")&&word.contains("ä")&&word.contains("ö")){
                words.add(word);
            }
        }
        return words;
    }
    
}
