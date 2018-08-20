/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class Flight {
    private String departureCode;
    private Airplane airplane;
    private String destinationCode;
    
    public Flight(String departureCode, String destinationCode, Airplane airplane){
        this.departureCode=departureCode;
        this.destinationCode=destinationCode;
        this.airplane=airplane;
    }
    
    public String toString(){
        return this.airplane.toString()+" ("+this.departureCode+"-"+this.destinationCode+")";
    }
    
}
