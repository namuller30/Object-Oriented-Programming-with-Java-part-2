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
public class ProductContainer extends Container {
    private String product;
    

    public ProductContainer(String productName, double tilavuus) {
        super(tilavuus);
        this.product=productName;
    }
    
    public String getName(){
        return this.product;
    }
    
    public void setName(String newName){
        this.product=newName;
    }
    
    @Override
    public String toString(){
        return this.product+": volume = "+super.getVolume()+", free space "+super.getCurrentCapacity();
    }
    
}
