
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
         printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        characterString=getStringWithSmiles(characterString);
        printSmileys(characterString.length());
        System.out.println("");
        System.out.println(characterString);
        //System.out.println("");
        printSmileys(characterString.length());
        System.out.println("");
        
        
        
        
    }
    
    private static void printSmileys(int numberOfSmiles){
        for (int i=0;i<numberOfSmiles/2;i++){
            System.out.print(":)");
        }
    }
    
    private static String getStringWithSmiles(String characterString){
        if (characterString.length()%2==0){
            characterString=":) "+characterString+" :)";
        }
        else{
            characterString=":) "+characterString+"  :)";
        }
        return characterString;
    }
    
    

}
