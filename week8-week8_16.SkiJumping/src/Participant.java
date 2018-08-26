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

public class Participant implements Comparable<Participant> {
    private String name;
    private int points;
    private ArrayList<Integer> jumps;
    
    public Participant(String name){
        this.name=name;
        this.jumps=new ArrayList<Integer>();
    }
    
    public void addPoints(int points){
        this.points+=points;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public String toString(){
        return this.name+" ("+this.points+" points)";
    }
    
    public void addJump(int length){
        this.jumps.add(length);
    }
    
    public void printJumps(){
        System.out.print("            jump lengths: ");
        for (Integer jump : jumps){
            System.out.print(""+jump+" m, ");
        }
        System.out.println("");
    }
    
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Participant participant){
        if (this.points==participant.getPoints()){
            return 0;
        }
        else if (this.points>participant.getPoints()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
