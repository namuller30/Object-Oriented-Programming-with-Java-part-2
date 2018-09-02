/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ninja
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    
    public AverageSensor(){
        this.sensors=new ArrayList<Sensor>();
        this.readings=new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    @Override
    public boolean isOn() {
        boolean on=true;
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                on=false;
            }
        }
        return on;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                sensor.on();
            }
        }
        
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if ((!this.isOn()) || this.sensors.isEmpty()){
            throw new IllegalStateException("Average sensor is not on.");
        }
        int total=0;
        for (Sensor sensor : sensors){
            total+=sensor.measure();
        }
        
        int average= total/sensors.size();
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings(){
        return this.readings;
        
    }
        
    
}
