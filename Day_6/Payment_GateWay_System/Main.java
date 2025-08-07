/*
 * 1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. 
 * Also include a method to display the transaction summary.]
 */
package Day_6.Payment_GateWay_System;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int id = 10000;
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.setTransactionId("TNX"+(++id));
        System.out.print("Enter Payer Name: ");
        transaction.setPayerName(scan.nextLine());

        System.out.print("Enter Payee Name: ");
        transaction.setPayeeName(scan.nextLine());

        System.out.print("Enter Amount: ");
        transaction.setAmount(scan.nextDouble());
        scan.nextLine();  

        System.out.print("Enter Payment Method (example, UPI, Card): ");
        transaction.setPaymentMethod(scan.nextLine());

        System.out.print("Enter Transaction Status (exmple, Success/Failed): ");
        transaction.setTransactionStatus(scan.nextLine());

        System.out.println();
        transaction.displayTransactionSummary();
    }
}

