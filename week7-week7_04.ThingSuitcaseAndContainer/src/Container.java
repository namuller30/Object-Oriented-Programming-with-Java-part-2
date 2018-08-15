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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> Container;
    private int weight;
    
    public Container(int maxWeight){
        this.maxWeight=maxWeight;
        this.Container = new ArrayList<Suitcase>();
        this.weight=0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.weight+suitcase.totalWeight()<=this.maxWeight){
            this.Container.add(suitcase);
            this.weight+=suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return ""+this.Container.size()+" suitcases ("+this.weight+"kg)";
    }
    
    public void printThings(){
        for (Suitcase suitcase : this.Container){
            suitcase.printThings();
        }
    }
        
    
}
