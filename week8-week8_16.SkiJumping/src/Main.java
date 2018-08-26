import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       ParticipantList participantList=new ParticipantList();
       
       
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        //Collect the participants
        while (true){
            System.out.println("  Participant name:");
            String input = reader.nextLine();
            if (input.isEmpty()){
                break;
            }
            else{
                Participant participant = new Participant(input);
                participantList.addParticipant(participant);
            }
        }
        
        System.out.println("\nThe tournament begins!\n");
        
        int round=1;
        while (true){
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input=reader.nextLine();
            //quit if jump
            if (!input.equals("jump")){
                break;
            }
            else{
                System.out.println("Round "+round+"\n");
                System.out.println("Jumping order:\n");
                participantList.printList();
                System.out.println("Results of round "+round);
                participantList.doRound();
                
                
                
                round++;
            }
            
        }
        
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        participantList.printResults();
        
        
        
    }
}
