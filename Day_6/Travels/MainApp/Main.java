/*
 * 4. Design a travel booking system using two packages:

travel.booking – includes a class Ticket with ticket ID, destination, and fare.

travel.user – includes a class User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
 */
package Day_6.Travels.MainApp;
import java.util.Scanner;

import Day_6.Travels.Travel_User.User;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("1. Avaiable Fare\n2. Book Tickect\n3. Exit\n");
            System.out.print("Enter The Choice : ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    fare();
                    break;
                case 2:
                    User user = new User();
                    setDetails(user);
                    System.out.println("1. Show Tickect\n2. Back To Menu\n");
                    System.out.print("Enter the Choice : ");
                    int ch = scan.nextInt();
                    scan.nextLine();
                    switch (ch) {
                        case 1:
                            user.displayDetails();
                            break;
                        default:
                            break;       
                    }
                    break; 
                default:
                    System.exit(0);
            }
        }
    }

    public static void fare(){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Chennai  : 500");
        System.out.println("Mumbai   : 600");
        System.out.println("Madurai  : 400");
        System.out.println("Thirchy  : 300");
        System.out.println("------------------------------------------------------------------------------------------");
    }

     public static void setDetails(User user) {
        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter age: ");
        int age = scan.nextInt();
        scan.nextLine(); 

        System.out.print("Enter email ID: ");
        String emailId = scan.nextLine();

        System.out.print("Enter contact number: ");
        String contactNo = scan.nextLine();

        System.out.print("Enter destination: ");
        String destination = scan.nextLine();
        user.bookTickect(name, age, emailId, contactNo, destination);
    }
}
