/*
 * 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. 
 * Write a main class where you can accept payment using different methods.
 */
package Day_7.Payment_Gateway_System;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static double amount;
    public static void main(String[] args) {
        while(true){
            System.out.println("1. CreditCardPayment\n2. DebitCardPayment\n3. UPIPayment\nExit : 4");
            System.out.print("Enter The Choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter The Amount : ");
                    amount = scan.nextInt();
                    CreditCardPayment  creditCardPayment = new CreditCardPayment();
                    creditCardPayment.pay(amount);
                    break;
                case 2:
                    System.out.print("Enter The Amount : ");
                    amount = scan.nextInt();
                    DebitCardPayment debitCardPayment = new DebitCardPayment();
                    debitCardPayment.pay(amount);
                    break;
                case 3:
                    System.out.print("Enter The Amount : ");
                    amount = scan.nextInt();
                    UPIPayment upiPayment = new UPIPayment();
                    upiPayment.pay(amount);
                    break;
                default:
                    System.exit(0);
            }
        }  
    }
}
