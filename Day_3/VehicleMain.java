/*
 4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
 */
package Day_3;
import Day_3.Vehicle;
public class VehicleMain {
    public static void main(String[] args) {
        // Create Vehicle Object
        Vehicle  toyota = new Vehicle(101, "Corolla", "Toyota", 200000);
        Vehicle  bmw = new Vehicle(102, "3 Series ", " BMW", 4000000);
        Vehicle  hyundai = new Vehicle(103, "Verna", "Hyundai", 200000);
        // How Many Vehicle Created Count
        System.out.println("How many Vehicle has been Created : "+Vehicle.vehicleCount);  
    }
}
