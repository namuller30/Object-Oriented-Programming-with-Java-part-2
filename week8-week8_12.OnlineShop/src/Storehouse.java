
import java.util.Map;

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

public class Storehouse {
    private Map<String,Integer> storagePrices;
    private Map<String,Integer> storageStock;
    
    public Storehouse(){
        this.storagePrices=new HashMap<String,Integer>();
        this.storageStock=new HashMap<String,Integer>();
    }
    
    public void addProduct(String product,int price,int stock){
        this.storagePrices.put(product, price);
        this.storageStock.put(product, stock);
    }
    
    public int price(String product){
        if (this.storagePrices.containsKey(product)&&this.storageStock.get(product)>0){
            return this.storagePrices.get(product);
        }
        else {
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.storageStock.containsKey(product)){
            return this.storageStock.get(product);
        }
        else {
            return 0;
        }
    }
    
    public boolean take(String product){
        if (this.stock(product)>0){
            this.storageStock.put(product,this.stock(product)-1);
            return true;
        }
        else{
            return false;
        }
    }
    
    public Set<String> products(){
        return this.storageStock.keySet();
    }
    
}

