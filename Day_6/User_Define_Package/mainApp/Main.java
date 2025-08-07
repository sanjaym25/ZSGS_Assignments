/*
 * 2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
 */
package Day_6.User_Define_Package.mainApp;
import Day_6.User_Define_Package.stringutility.*;
import Day_6.User_Define_Package.arithmetic.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String Input
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        Concatenate c = new Concatenate();
        Reverse r = new Reverse();
        Length l = new Length();

        String result = c.concat(str1, str2);
        System.out.println("Concatenated: " + result);

        String reversed = r.reverse(str1);
        System.out.println("Reversed first string: " + reversed);

        int len = l.getLength(str1);
        System.out.println("Length of first string: " + len);

        // Arithmetic Input
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();

        System.out.println("Addition: " + a.add(num1, num2));
        System.out.println("Subtraction: " + s.subtract(num1, num2));
        System.out.println("Multiplication: " + m.multiply(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + d.divide(num1, num2));
        } else {
            System.out.println("Division by zero not allowed!");
        }

    }
}

