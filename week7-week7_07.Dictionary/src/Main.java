
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            Dictionary dictionary = new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("porkkana"));
        System.out.println(dictionary.amountOfWords());
        
        
    ArrayList<String> translations = dictionary.translationList();
    for(String translation: translations) {
        System.out.println(translation);
    }
    
    Scanner reader = new Scanner(System.in);
    Dictionary dict = new Dictionary();

    TextUserInterface ui = new TextUserInterface(reader, dict);
    ui.start();
    }
}
