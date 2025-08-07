package Vehicles;

public class Ford extends Car {
    String modelType;
    Ford(double mileage,double price,long ownerShipCost,String warranty,int seatingCapacity,String fuelType,String modelType){
        super(mileage, price, ownerShipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }  
    
     @Override
    public String toString(){
        String details =  "Mileage : "+this.mileage+"\n"+
                          "Price : "+this.price+"\n"+
                          "OwnerShip Cost :"+this.ownerShipCost+"\n"+
                          "Warranty :"+this.warranty+"\n"+
                          "seatingCapacity :"+this.seatingCapacity+"\n"+
                          "FuelType : "+this.fuelType+"\n"+
                          "Model Type : "+this.modelType+"\n";
        return details;
    }
}