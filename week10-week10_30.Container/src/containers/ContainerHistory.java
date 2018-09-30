/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ninja
 */
public class ContainerHistory {
    private ArrayList<Double> containerHistory;
    
    public ContainerHistory(){
        this.containerHistory= new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.containerHistory.add(situation);
    }
    
    public void reset(){
        this.containerHistory.clear();
    }
    
    @Override
    public String toString(){
        return this.containerHistory.toString();
    }
    
    public double maxValue(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        
        double max=-999999;
        for (double value : this.containerHistory){
            if (value>max){
                max=value;
            }
        }
        return max;
    }
    
    public double minValue(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        double min=999999;
        for (double value : this.containerHistory){
            if (value<min){
                min=value;
            }
        }
        return min;
    }
    
    public double average(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        double total=0;
        for (double value: this.containerHistory){
            total+=value;
        }
        return (total/this.containerHistory.size());
    }
    
    public double greatestFluctuation(){
        if (this.containerHistory.isEmpty()){
            return 0;
        }
        
        double fluc=0;
        for(int i=0;i<this.containerHistory.size()-1;i++){
            double thisFluc=this.containerHistory.get(i)-this.containerHistory.get(i+1);
            thisFluc=java.lang.Math.abs(thisFluc);
            if (thisFluc>fluc){
                fluc=thisFluc;
            }
        }
        return fluc;
       
    }
    
    public double variance(){
        if (this.containerHistory.isEmpty()||this.containerHistory.size()==1){
            return 0;
        }
        
        double total=0;
        for (double value : this.containerHistory){
            total+=(value-this.average())*(value-this.average());
        }
        return (total/(this.containerHistory.size()-1));
    }
}
