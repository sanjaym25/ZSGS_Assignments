package Day_5.Tickect_Booking;

import java.util.Scanner;

public class Bus extends Tickect{
    static byte id = 0;
    static int id1 = 1000;
    static Scanner scan = new Scanner(System.in);

    Bus(){
        super();
    }
    Bus(String name,int age,String gender,String tickectId,String destination,String seetId){
        super(name, age, gender, tickectId, destination,seetId);
    }
    @Override
    public void bookTickect() {
        System.out.print("****     Tickect Book Details    *****");
        if(Service.bus.size()<=60){
        this.seetId = "BSID"+(++id);
        this.tickectId = "BusT"+(++id1);
        System.out.print("Enter the Name : ");
        this.name = scan.nextLine();
        System.out.print("Enter the Age : ");
        this.age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Gender : ");
        this.gender = scan.nextLine();
        System.out.print("Enter the Destination : ");
        this.destination = scan.nextLine();
        Bus bus = new Bus(name, age, gender, tickectId, destination,seetId);
        Service.bus.add(bus); 
        System.out.println("****      Tickect Booked SuccessFully   ****");
        }
        else System.out.println("Tickect Booking Closed");
    }
     public void showTicket(){
        System.out.println("****     Show Ticket Details     ****");
        System.out.print("{ Name : "+this.name+",   ");
        System.out.print("Age : "+this.age+",   ");
        System.out.print("Gender : "+this.gender+",   ");
        System.out.print("Ticket id : "+this.tickectId+",   ");
        System.out.print("Seet Id : "+this.seetId+",   ");
        System.out.print("Source : "+Tickect.source+",   ");
        System.out.println("Distination : "+this.destination+", }");
    }
}
