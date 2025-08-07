/*
 * 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, 
 * NumberFormatException, ArithmeticException and Exception.
 */
package Day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Nmber 1 : ");
        String num1 = scan.nextLine();
        System.out.print("Enter The Nmber 2 : ");
        String num2 = scan.nextLine();
        try{
            int n = Integer.parseInt(num1);
            int n1 = Integer.parseInt(num2);
            int div = n/n1;
            try{
                System.out.println("Enter The Number ");
                int number = scan.nextInt();
            }
            catch(InputMismatchException e){
                e.printStackTrace();
            }
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            scan.close();
        }
    }
}
