package Day_3;

public class Vehicle {
    // Static Variable Using for Hoe Many Vehicle Created in the Class
    static int vehicleCount = 0; 
    // Instance Variable In Class
    int vehicle_ID;
    String brand;
    String vehicleName;
    long price;
    // Assign the Value Of Parametrized constructor
    Vehicle(int vehicle_ID,String brand,String vehicleName,long price){
        this.vehicle_ID = vehicle_ID;
        this.brand = brand;
        this.vehicleName = vehicleName;
        this.price = price;
        vehicleCount++;
    }
}