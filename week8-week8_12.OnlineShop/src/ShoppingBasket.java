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

public class ShoppingBasket {
    private Map<String,Purchase> basket;
    
    public ShoppingBasket(){
        this.basket=new HashMap<String,Purchase>();
        
    }
    public void add(String product,int price){
        Purchase purchase = new Purchase(product,1,price);
        if (this.basket.containsKey(product)){
            this.basket.get(product).increaseAmount();
        }
        else{
            this.basket.put(product, purchase);
        }
    }
    
    public int price(){
        int total=0;
        for (String product : this.basket.keySet()){
            total+=this.basket.get(product).price();
        }
        return total;
    }
    
    public void print(){
        for (String product: this.basket.keySet()){
            System.out.println(this.basket.get(product));
        }
    }
}
