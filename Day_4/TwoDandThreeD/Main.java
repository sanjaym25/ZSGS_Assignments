/*
 2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a print statement to the TwoD default constructor with a message "TwoD default constructor"
Add a print statement to other TwoD constructor with a message "TwoD constructor with two arguments"
 */

package TwoDandThreeD;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The X, Y, Z, :");
        System.out.print("Enter The X :");
        int x = scan.nextInt();
        System.out.print("Enter The Y :");
        int y = scan.nextInt();
        System.out.print("Enter The Z :");
        int z = scan.nextInt();

        // default Constructor Call The Object Create

        ThreeD threeD = new ThreeD();
        threeD.setX(x);
        threeD.setY(y);
        threeD.setZ(z);

        // Parametrized Constructor Create Object

        System.out.println("Enter The X1, Y1, Z1, :");
        System.out.print("Enter The X :");
        int x1 = scan.nextInt();
        System.out.print("Enter The Y :");
        int y1 = scan.nextInt();
        System.out.print("Enter The Z :");
        int z1 = scan.nextInt();
       
        ThreeD threeD1 = new ThreeD(x1,y1,z1);
        
        double distance = threeD.distanceCalculate(threeD1);

        System.out.println(distance);

    }
}
