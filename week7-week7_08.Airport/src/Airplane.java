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

public class Airplane {
    private String ID;
    private int capacity;
    private ArrayList<Flight> flights;
    
    public Airplane(String ID, int capacity){
        this.ID=ID;
        this.capacity=capacity;
        this.flights= new ArrayList<Flight>();
    }
    
    public String toString(){
        return this.ID+" ("+this.capacity+" ppl)";
    }
    
    public String getID(){
        return this.ID;
    }
    
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    
    public void printFlights(){
        for (Flight flight: flights){
            System.out.println(flight);
        }
    }
    
}
