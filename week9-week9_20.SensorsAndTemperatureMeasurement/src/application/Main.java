/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ninja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AverageSensor ka = new AverageSensor();
    ka.addSensor( new ConstantSensor(3) );
    ka.addSensor( new ConstantSensor(7) );
    ka.readings();
}
    }
    

