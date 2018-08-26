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

public class Jump {
    private int length;
    private ArrayList<Integer> scores;
    private Random random;
    
    public Jump(){
        this.random=new Random();
        this.scores=new ArrayList<Integer>();
        this.setLength();
        this.generateScores();
        
    }
    
    private void setLength(){
        int score=0;
        while (true){
              score=random.nextInt(120);
              if (!(score<60)){
                  break;
              }
            }
        this.length=score;    
    }
    
    private void generateScores(){
        int score = 0;
        for (int i=0;i<5;i++){
            while (true){
              score=random.nextInt(20);
              if (!(score<10)){
                  break;
              }
            }
            
            this.scores.add(score);    
        }
        //Sort the scores after they are generated
        Collections.sort(this.scores);
    }
    
    public int getLength(){
        return this.length;
    }
    
    public ArrayList<Integer> getScores(){
        return this.scores;
    }
    
    public int calculateScore(){
        int totalscore=scores.get(1)+scores.get(2)+scores.get(3)+this.length;
        return totalscore;
    }
    
    
    
}
