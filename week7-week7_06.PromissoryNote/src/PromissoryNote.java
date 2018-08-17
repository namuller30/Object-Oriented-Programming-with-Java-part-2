/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 **/
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String,Double> ledger;
    
    public PromissoryNote(){
        this.ledger=new HashMap<String,Double>();
        
    }
    
    public void setLoan(String toWhom, double value){
        this.ledger.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if (this.ledger.containsKey(whose)){
            return this.ledger.get(whose);
        }
        return 0;
    }
    
}
