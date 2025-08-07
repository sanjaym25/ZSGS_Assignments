/*
 * 5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.

Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode must implement differently.

Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the interface.

Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base class/interface.
 */
package Day_7.Tickect_Booking;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            System.out.println("*****      Tickect booking System    ******");
            System.out.println("Bus Tickect 1\nTrain Tickect  2\nFlight Ticket 3\nExit 4\n");
            System.out.print("Enter The Number : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Tickect bus = new Bus();
                    bus.bookTickect();
                    if(Service.bus.size()<=60){
                        Bus b = (Bus) bus;
                        b.showTicket();
                    }
                    break;
                case 2:
                    Tickect train = new Train();
                    train.bookTickect();
                    if(Service.train.size()<=300){
                        Train t = (Train) train;
                        t.showTicket();
                    }
                    break;
                case 3:
                    Tickect flight = new Flight();
                    flight.bookTickect();
                    if(Service.flight.size()<=300){
                        Flight f = (Flight) flight;
                        f.showTicket();
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
