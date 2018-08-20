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

public class Airport {
    private ArrayList<Airplane> airplanes;
    
    
    public Airport(){
        this.airplanes=new ArrayList<Airplane>();
        
    }
    
    public void addPlane(Airplane airplane){
        this.airplanes.add(airplane);
    }
    
    public Airplane getPlane(String ID){
        for (Airplane plane : airplanes){
            if (plane.getID().equals(ID)){
                return plane;
            }
        }
        
        return null;
    }
    
    public void printPlanes(){
        for (Airplane plane: airplanes){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for (Airplane plane : airplanes){
            plane.printFlights();
        }
    }


    
}
