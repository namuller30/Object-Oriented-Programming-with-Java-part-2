
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class RingingCentre {
    private Map<Bird,List<String>> ringingCentre;
    
    
    public RingingCentre(){
        this.ringingCentre=new HashMap<Bird,List<String>>();
        
        
    }
    
    public void observe(Bird bird, String place){
        boolean exists=false;
        List<String> places = new ArrayList<String>();
        for (Bird tempBird : this.ringingCentre.keySet()){
            if (tempBird.equals(bird)){
                places = this.ringingCentre.get(bird);
                places.add(place);
                this.ringingCentre.put(bird, places);
                exists=true;
            }
        }
        if (!exists){
            places.add(place);
            this.ringingCentre.put(bird, places);
        }
    }
    
    public void observations(Bird bird){
        List<String> places = this.ringingCentre.get(bird);
        try{
        if (places.size()>0){
            System.out.println(bird.toString()+" observations: "+places.size());
            for (String place : places){
                System.out.println(place);
            }
        }
        }catch (Exception e){
            System.out.println(bird.toString()+" observations: 0");
        }
    }
    
    
    
}
