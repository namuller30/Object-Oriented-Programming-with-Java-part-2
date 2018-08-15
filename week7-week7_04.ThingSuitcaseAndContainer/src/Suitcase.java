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

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;
    private int weight;
    
    public Suitcase(int weightLimit){
        this.weightLimit=weightLimit;
        this.things = new ArrayList<Thing>();
        this.weight=0;
    }
    
    public void addThing(Thing thing){
        if (this.weight+thing.getWeight()<=this.weightLimit){
            things.add(thing);
            this.weight+=thing.getWeight();
        }
        
    }
    
    public String toString(){
        if (this.things.size()==1){
            return ""+this.things.size()+" thing ("+this.weight+"kg)";
        }
        
        else if (this.things.size()!=0){
            return ""+this.things.size()+" things ("+this.weight+"kg)";
            
        }
        else
            return "empty (0 kg)";
    }
    
    public void printThings(){
        for (Thing thing: things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        return this.weight;
    }
    
    public Thing heaviestThing(){
        Thing heaviestThing = new Thing("Temp", 0); //create a holder thing
        if (this.things.size()==0){
            return null;
        }
        for (Thing thing : this.things){
            if (thing.getWeight()>heaviestThing.getWeight()){
                heaviestThing = thing;
            }
        }
        return heaviestThing;
        
    }
    
}
