/*
 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters
 */
package Day_9;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**    Register For Voting System      ****");
        System.out.print("Enter The Age : ");
        byte age = scan.nextByte();
        try{
            if(age<18){
                throw new InEligiblePersonException(age);
            }
            System.out.println("***   You Are Eligible For Voting    *** ");
        }
        catch(InEligiblePersonException e){
            System.out.println(e.getMessage());
        }
        finally{
            scan.close();
        }
    }
}

class InEligiblePersonException extends Exception{
    InEligiblePersonException(byte age){
        super("You Are Not Eligible Voting System Only Above 18");
    }
}
