/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator(){
       this.reader = new Reader();
       this.calculations=0;
        
    }
    
        public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                this.calculations++;
            } else if (command.equals("difference")) {
                difference();
                this.calculations++;
            } else if (command.equals("product")) {
                product();
                this.calculations++;
            }
        }

        statistics();
    }
        
       private void sum() {
            System.out.print("value1: ");
            int value1 = reader.readInteger();
            System.out.print("value2: ");
            int value2 = reader.readInteger();
            System.out.println("Sum of the values "+(value1+value2));
       // print the value according to the example above
    }
       
       private void product() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("Product of the values "+(value1*value2));
    }
       
       private void difference() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       System.out.println("Difference of the values "+(value1-value2));
    }
       
       private void statistics(){
           System.out.println("Calculations done "+calculations);
       }
       
       
}
