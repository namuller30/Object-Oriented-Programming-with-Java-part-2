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

public class ParticipantList {
    private ArrayList<Participant> participantList;
    
    public ParticipantList(){
        this.participantList=new ArrayList<Participant>();
    }
    
    public void addParticipant(Participant participant){
        this.participantList.add(participant);
    }
    
    public int getSize(){
        return this.participantList.size();
    }
    
    public void printList(){
        int i=1;
        for (Participant participant : this.participantList){
            System.out.println("  "+i+". "+participant);
            i++;
        }
    }
    
    public void doRound(){
        for (Participant participant : this.participantList){
            Jump jump = new Jump();
            System.out.println("  "+participant.getName());
            System.out.println("     length: "+jump.getLength());
            System.out.println("     judge votes: "+jump.getScores());
            participant.addPoints(jump.calculateScore());
            participant.addJump(jump.getLength());
        }
        Collections.sort(participantList);
    }
    
    public void printResults(){
        int i=1;
        Collections.reverse(participantList);
        for (Participant participant : this.participantList){
            System.out.println(""+i+"           "+participant);
            participant.printJumps();
            i++;
        }
    }
    
    
    
        
        
}
