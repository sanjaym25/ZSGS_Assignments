package Vehicles;

public class Bike extends Vehicles{
    int numberOfCylinder;
    int numberOfGears;
    String coolingType;
    String wheelType;
    double fuelTankSize;
    String warranty;

    Bike(double mileage, double price, int numberOfCylinder2,int numberOfGears2,String coolingType,String wheelType,double fuelTankSize,String warranty){
        super(mileage, price);
        this.numberOfCylinder = numberOfCylinder2;
        this.numberOfGears = numberOfGears2;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
        this.warranty = warranty;
    }

}
