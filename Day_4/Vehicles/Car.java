package Vehicles;

public class Car extends Vehicles {
    long ownerShipCost;
    String warranty;
    int seatingCapacity;
    String  fuelType;
    Car(double mileage,double price,long ownerShipCost,String warranty,int seatingCapacity2,String fuelType){
        super(mileage, price);
        this.ownerShipCost = ownerShipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity2;
        this.fuelType = fuelType;
    }
}
