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

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> stored;
    private double weight;
    
    public Box(double maxWeight){
        this.maxWeight=maxWeight;
        this.stored=new ArrayList<ToBeStored>();
        this.weight=0;
    }
    
    public void add(ToBeStored item){
        if(this.weight+item.weight()<=this.maxWeight){
            stored.add(item);
            this.weight+=item.weight();
        }
    }
    
    public double weight(){
        double weight=0;
        for (ToBeStored item: stored){
            weight+=item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: "+this.stored.size()+" things, total weight "+this.weight+" kg";
    }
}
