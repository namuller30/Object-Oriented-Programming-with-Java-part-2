/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author ninja
 */
public class Thermometer implements Sensor {
    private Random random;
    private boolean on;
    
    public Thermometer(){
        this.random=new Random();
        this.on=false;
    }
    @Override
    public boolean isOn() {
       return this.on;
    }

    @Override
    public void on() {
        this.on=true;
    }

    @Override
    public void off() {
      this.on=false;
    }
    
    @Override
    public int measure() {
        if (this.on=false){
            throw new IllegalStateException("The Thermometer must be on before measure can be called.");
            
        }
        else {
            int measure=random.nextInt(61)-30;
            
            return measure;
        }
    }
    
}
