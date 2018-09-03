/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author ninja
 */
public class Analysis {
    private File file;
    
    public Analysis(File file) throws Exception{
        this.file=file;
    }
    
    public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int lines=0;
        while (reader.hasNextLine()){
            reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
        }
    
    
    
    public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        int characters=0;
        while (reader.hasNext()){
            String tempWord=reader.next();
            characters+=tempWord.length()+1;
        }
        return characters;
    }
    
}
