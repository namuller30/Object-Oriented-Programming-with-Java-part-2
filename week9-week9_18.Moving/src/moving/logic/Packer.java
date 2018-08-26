/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author ninja
 */
import moving.domain.Box;
import java.util.ArrayList;
import java.util.List;
import moving.domain.Thing;

public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        ArrayList<Box> packedList = new ArrayList<Box>();
        for (Thing thing : things){
            Box box = new Box(this.boxesVolume);
            box.addThing(thing);
            packedList.add(box);
        }
        return packedList;
    }
}
