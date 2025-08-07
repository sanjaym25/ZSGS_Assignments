/*
 7. Design a calculator application using Java Inheritance. Create the following class hierarchy:
--->BasicCalculator (Base class):
Implement all the basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
--->AdvancedCalculator (Inherits from BasicCalculator)
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
--->ScientificCalculator (Inherits from AdvancedCalculator)
Add scientific functions, such as:
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.
 */
package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        while (true) {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square Root");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Log");
            System.out.println("11. Exp");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            int a, b;
            double x;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.print("Enter One numbers: ");
                    a = sc.nextInt();
                    System.out.print("Enter two numbers: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.print("Enter one numbers: ");
                    a = sc.nextInt();
                    System.out.print("Enter two numbers: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.print("Enter one numbers: ");
                    a = sc.nextInt();
                    System.out.print("Enter two numbers: ");
                    b = sc.nextInt();
                    if (b == 0) System.out.println("Cannot divide by zero.");
                    else System.out.println("Result: " + calc.divide(a, b));
                    break;
                case 5:
                    System.out.print("Enter base : ");
                    a = sc.nextInt();
                    System.out.print("Enter  exponent: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + calc.power(a, b));
                    break;
                case 6:
                    System.out.print("Enter one numbers: ");
                    a = sc.nextInt();
                    System.out.print("Enter two numbers: ");
                    b = sc.nextInt();
                    System.out.println("Result: " + calc.modulus(a, b));
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    x = sc.nextDouble();
                    if (x < 0) System.out.println("Square root of negative number is not real.");
                    else System.out.println("Result: " + calc.squareRoot(x));
                    break;
                case 8:
                    System.out.print("Enter angle (degrees): ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + calc.sin(x));
                    break;
                case 9:
                    System.out.print("Enter angle (degrees): ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + calc.cos(x));
                    break;
                case 10:
                    System.out.print("Enter value: ");
                    x = sc.nextDouble();
                    if (x <= 0) System.out.println("Log not defined for non-positive numbers.");
                    else System.out.println("Result: " + calc.log(x));
                    break;
                case 11:
                    System.out.print("Enter value: ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + calc.exp(x));
                    break;
                case 0:
                    System.out.println("Exiting Calculator...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

