package Vehicles;

public class Tvs extends Bike{
    String makeType;
    Tvs(double mileage, double price, int numberOfCylinder,int numberOfGears,String coolingType,String wheelType,double fuelTankSize,String warranty,String makeType){
        super(mileage, price, numberOfCylinder, numberOfGears, coolingType, wheelType, fuelTankSize, warranty);
        this.makeType = makeType;
    }

    @Override
    public String toString(){
        String details =  "Mileage : "+this.mileage+"\n"+
                          "Price : "+this.price+"\n"+
                          "numberOfCylinde :"+this.numberOfCylinder+"\n"+
                          "Warranty :"+this.warranty+"\n"+
                          "numberOfGear :"+this.numberOfGears+"\n"+
                          "coolingType : "+this.coolingType+"\n"+
                          "wheelType : "+this.wheelType+"\n"+
                          "fuelTankSize : "+this.fuelTankSize+"\n"+
                          "fuelTankSize : "+this.fuelTankSize+"\n"+
                          "makeType : "+this.makeType+"\n";
        return details;
    }
}
