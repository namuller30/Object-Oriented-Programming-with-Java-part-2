import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Airport panel\n" +"--------------------\n");
        Airport airport = new Airport();
        while (true){
            int input=0;
            System.out.println("Choose operation:\n" +
                                "[1] Add airplane\n" +
                                "[2] Add flight\n" +
                                    "[x] Exit\n");
           try {
              input=Integer.parseInt(reader.nextLine());
            } catch (java.lang.NumberFormatException e) { 
               break;}
        
      
            if (input==1){
                System.out.println("Give plane ID: ");
                String ID=reader.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity=Integer.parseInt(reader.nextLine());
                Airplane airplane;
                airplane = new Airplane(ID,capacity);
                airport.addPlane(airplane);
            }
            
            else if (input==2){
                System.out.println("Give plane ID: ");
                String ID=reader.nextLine();
                Airplane airplane;
                airplane = airport.getPlane(ID);
                System.out.println("Give departure airport code: ");
                String depCode=reader.nextLine();
                System.out.println("Give destination airport code:");
                String destCode=reader.nextLine();
                Flight flight=new Flight(depCode,destCode,airplane);
                airplane.addFlight(flight);
                
            }
            
            else {
                break;
            }
    }
        
        System.out.println("Flight service\n" +"------------\n");
        
        while (true){
            int input=0;
            System.out.println("Choose action:\n" +"[1] Print planes\n" +"[2] Print flights\n" +"[3] Print plane info\n" +"[x] Quit");
            try {
              input=Integer.parseInt(reader.nextLine());
            } catch (java.lang.NumberFormatException e) { 
               break;}
            
            if (input==1){
                airport.printPlanes();
            }
            
            if (input==2){
                airport.printFlights();
            }
            if (input==3){
                System.out.println("Give plane ID: ");
                String ID=reader.nextLine();
                Airplane airplane;
                airplane = airport.getPlane(ID);
                System.out.println(airplane);
                
            }
        
        
    }
}
}
