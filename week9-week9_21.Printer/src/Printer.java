/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author ninja
 */
public class Printer {
    private File file;
    
    public Printer(String fileName){
        this.file = new File(fileName);

    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        if (word.isEmpty()){
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
        }
        else{
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                if (line.contains(word)){
                    System.out.println(line);
                }
            }
        }
        reader.reset();
    }
}
