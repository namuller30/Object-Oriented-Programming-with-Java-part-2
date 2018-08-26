/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author ninja
 */
import java.util.ArrayList;

public class Box implements Thing {
    private final int maximumCapacity;
    private ArrayList<Thing> things;
    private int volume;
    
    public Box(int maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.things=new ArrayList<Thing>();
        this.volume=0;
    }
    
    public boolean addThing(Thing thing){
        if (thing.getVolume()+this.volume<=this.maximumCapacity){
            things.add(thing);
            this.volume+=thing.getVolume();
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
    
}
