
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ninja
 */
public class UserInterface {
    private Scanner reader;
    
    public UserInterface(Scanner reader){
        this.reader=reader;
        this.startProgram();
        this.commandRead(reader);
        
    }
    
    private void startProgram(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
    
    private void commandRead(Scanner reader){
        PhoneBook phoneBook = new PhoneBook();
        while(true){
            System.out.println("command: ");
            int input=0;
            try{
                input = reader.nextInt();
            }
            catch (Exception e){
                break;
            }
            if (input==1){
                reader.nextLine();
                System.out.println("whose number: ");
                String name=reader.nextLine();
                //reader.nextLine();
                System.out.println("number: ");
                String phoneNumber=reader.nextLine();
                if (phoneBook.containsPerson(name)){
                    Person person = phoneBook.getPerson(name);
                    person.addPhoneNumber(phoneNumber);
                }
                else {
                    Person person = new Person(name);
                    phoneBook.addPerson(person);
                    person.addPhoneNumber(phoneNumber);
                }

            }
        
            else if (input==2){
                reader.nextLine();
                System.out.println("whose number: ");
                String name = reader.nextLine();
                if (phoneBook.containsPerson(name)){
                    Person person = phoneBook.getPerson(name);
                    person.printNumbers();
                }
                else{
                    System.out.println("  not found");
                }
            }
            
            else if (input==3){
                reader.nextLine();
                System.out.println("number: ");
                String number = reader.nextLine();
                String name=phoneBook.getPersonbyNumber(number);
                if (name.isEmpty()){
                    System.out.println(" not found");
                }
                else{
                    System.out.println(" "+name);
                }
            }
            
            else if (input==4){
                reader.nextLine();
                System.out.println("whose address: ");
                String name = reader.nextLine();
                System.out.println("street: ");
                String street = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                String address = street+" "+city;
                if (phoneBook.containsPerson(name)){
                    Person person = phoneBook.getPerson(name);
                    person.addAddress(address);
                }
                else {
                    Person person = new Person(name);
                    phoneBook.addPerson(person);
                    person.addAddress(address);
                }
            }
            
            else if (input==5){
                reader.nextLine();
                System.out.println("whose information: ");
                String name = reader.nextLine();
                if (phoneBook.containsPerson(name)){
                    Person person = phoneBook.getPerson(name);
                    person.printAddress();
                    person.printNumbers();

                }
                else{
                    System.out.println("  not found");
                }
                
            }
            
            else if (input==6){
                reader.nextLine();
                System.out.println("whose information: ");
                String name = reader.nextLine();
                phoneBook.removePerson(name);
            }
            
            else if (input==7){
                reader.nextLine();
                System.out.println("keyword (if empty, all listed): ");
                String keyword = reader.nextLine();
                phoneBook.printKeyword(keyword);
            }
            
            else{
                break;
            }
            System.out.println("");
            }
            
    }
    
    
    
    
}
