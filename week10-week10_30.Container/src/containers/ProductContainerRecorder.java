/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author ninja
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerH;
    
    
    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        this.containerH=new ContainerHistory();
        super.addToTheContainer(initialVolume);
        this.containerH.add(initialVolume);
        
    }
    
    public String history(){
        return this.containerH.toString();
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.containerH.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double amountTaken = super.takeFromTheContainer(amount);
        this.containerH.add(super.getVolume());
        return amountTaken;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history());
        System.out.println("Greatest product amount: "+containerH.maxValue());
        System.out.println("Smallest product amount: "+containerH.minValue());
        System.out.println("Average: "+containerH.average());
        System.out.println("Greatest change: "+containerH.greatestFluctuation());
        System.out.println("Variance: "+containerH.variance());
        
        
    }
    
    
        
    
        
        
    
}
