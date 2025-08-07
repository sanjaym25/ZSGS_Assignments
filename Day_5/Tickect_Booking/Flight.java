package Day_5.Tickect_Booking;

import java.util.Scanner;

public class Flight extends Tickect {
    static Scanner scan = new Scanner(System.in);
    static byte id = 0;
    static int id1 = 1000;
    Flight(){
        super();
    }
    Flight(String name,int age,String gender,String tickectId,String destination,String seetId){
        super(name, age, gender, tickectId, destination,seetId);
    }
    @Override
    public void bookTickect() {
        System.out.println("****     Tickect Book Details    *****");
        if(Service.flight.size()<=50){
         this.seetId = "FSID"+(++id);    
        this.tickectId = "FliT"+(++id1);
        System.out.print("Enter the Name : ");
        this.name = scan.nextLine();
        System.out.print("Enter the Age : ");
        this.age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Gender : ");
        this.gender = scan.nextLine();
        System.out.print("Enter the Destination : ");
        this.destination = scan.nextLine();
        Flight flight = new Flight(name, age, gender, tickectId, destination,seetId);
        Service.flight.add(flight);

        System.out.println("****      Tickect Booked SuccessFully   ****");
        }
        else System.out.println("Tickect Booking Closed");        
    }

    public void showTicket(){
        System.out.print("****     Show Ticket Details     ****");
        System.out.print("{ Name : "+this.name+",   ");
        System.out.print("Age : "+this.age+",   ");
        System.out.print("Gender : "+this.gender+",   ");
        System.out.print("Ticket id : "+this.tickectId+",   ");
        System.out.print("Seet Id : "+this.seetId+",   ");
        System.out.print("Source : "+Tickect.source+",   ");
        System.out.println("Distination : "+this.destination+", }");
    }
}
