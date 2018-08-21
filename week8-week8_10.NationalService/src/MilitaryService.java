/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }
    
    public void work(){
        if (this.daysLeft!=0){
                this.daysLeft-=1;
        }
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
}
