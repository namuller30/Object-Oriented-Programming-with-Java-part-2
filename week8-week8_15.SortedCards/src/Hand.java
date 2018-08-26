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

public class Hand implements Comparable<Hand> {
    private final ArrayList<Card> cards;
    private int sum;
    
    public Hand(){
        this.cards=new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card card : this.cards){
            System.out.println(card);
        }
    }
    
    public int getSum(){
        int total=0;
        for (Card card : this.cards){
            total+=card.getValue();
        }
        return total;
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
    
    @Override
    public int compareTo(Hand hand){
        if (this.getSum()==hand.getSum()){
            return 0;
        }
        else if (this.getSum()>hand.getSum()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.cards, new SortAgainstSuitAndValue() );
    }
}
