package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection word = new WordInspection(file);
        System.out.println(word.wordCount());
        System.out.println(word.wordsContainingZ());
        System.out.println(word.wordsEndingInL());
        System.out.println(word.palindromes());
        

    }
}
