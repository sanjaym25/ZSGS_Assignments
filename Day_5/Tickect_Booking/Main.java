/*
 4. Design a Java Ticket Booking System using polymorphism where Bus, 
 Train, and Flight tickets share a common method but implement booking differently.
 */
package Day_5.Tickect_Booking;

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
