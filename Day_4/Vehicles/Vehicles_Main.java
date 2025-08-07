/*
 1. We want to store the information about different vehicles. 
 Create a class named Vehicle with two data members named mileage and price. 
 Create its two subclasses
 ---Car with data members to store ownership cost, warranty (by years), seating capacity, and fuel type (diesel or gasoline).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses, Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 */

package Vehicles;

public class Vehicles_Main {
    public static void main(String[] args) {
        Audi audi = new Audi(15,200000,300000,"2years",8,"petrol","audi_12");
        Ford ford = new Ford(17,400000,500000,"3years",6,"decial","ford_Ax23");
        System.out.println("***     Audi Car   ***");
        System.out.println(audi);
        System.out.println("***     Ford Car   ***");
        System.out.println(ford);

        Bajaj bajaj = new Bajaj(80, 100000, 4, 5, "raditator", "Aloy", 20.0, "2 Years", "2022");
        System.out.println("***     Bajaj Bike  ****\n");
        System.out.println(bajaj);
        Bajaj tvs = new Bajaj(70, 90000, 4, 4, "No raditator", "Aloy", 15.0, "2 Years", "2025");
        System.out.println("****      Tvs Bike  ***\n");
        System.out.println(tvs);


    }
}
