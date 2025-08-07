//4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.
package Day_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Nmber 1 : ");
        String num = scan.nextLine();
        try{
            Integer.parseInt(num);
        }
        catch(InputMismatchException e){
            System.out.println("String is Not a valid Number");
        }
        finally{
            scan.close();
        }
    }
}
