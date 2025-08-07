/*
 * 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
 */
package Day_9;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Atm Pin :");
        String pin = scan.nextLine();
        try{
            if(pin.length()>4 || pin.length()<4){
                throw new PinLengthException(pin);
            }
            Integer.parseInt(pin);
            if(pin.charAt(0)-'0' == 0){
                throw new FirstZeroException(pin.charAt(0));
            }
            System.out.println("Pin Valid");
           }
        catch(PinLengthException e){
            System.out.println("Invalid PIN  "+e);
        } 
        catch(NumberFormatException e){
             System.out.println("Invalid PIN  "+e);
        } 
        catch(FirstZeroException e){
             System.out.println("Invalid PIN  : "+e);
        } 
        finally{
            scan.close();
        }
    }
}
class PinLengthException extends RuntimeException{
    String pin;
    PinLengthException(String pin){
        this.pin = pin;
    }
}
class FirstZeroException extends RuntimeException{
    char pin;
    FirstZeroException(char pin){
        this.pin = pin;
    }
}
