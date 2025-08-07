/*
 *1. All the banks operating in India are controlled by the RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set the minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use the 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
}
 */
package Day_7.RBI_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Welcome to RBI Banking System =====");
            System.out.println("1. SBI Bank");
            System.out.println("2. ICICI Bank");
            System.out.println("3. PNB Bank");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice >= 1 && choice <= 3) {
                // Get Customer Info
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Customer ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter DOB (dd-mm-yyyy): ");
                String dob = sc.nextLine();

                // Get Account Info
                System.out.print("Enter Account Number: ");
                String accNo = sc.nextLine();
                System.out.print("Enter Account Type (savings/current): ");
                String accType = sc.nextLine().toLowerCase();
                System.out.print("Enter IFSC Code: ");
                String ifsc = sc.nextLine();

                Customer customer = new Customer(name, id, age, dob);
                Account account = new Account(accNo, accType, ifsc);
                RBISystem bank = null;

                switch (choice) {
                    case 1:
                        bank = new SBIBank(customer, account);
                        Service.banksDetails.add(bank);
                        break;
                    case 2:
                        bank = new ICICIBank(customer, account);
                        Service.banksDetails.add(bank);
                        break;
                    case 3:
                        bank = new PNBBank(customer, account);
                        Service.banksDetails.add(bank);
                        break;
                }

                // Display
                System.out.println("\n===== Bank Details =====");
                printDetails(bank);
            } else if (choice == 4) {
                System.out.println(" Thank you for using RBI System. Goodbye!");
            } else {
                System.out.println(" Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void printDetails(RBISystem bank) {
        System.out.println("Customer Name     : " + bank.customer.getName());
        System.out.println("Account Number    : " + bank.account.getAccountNo());
        System.out.println("Account Type      : " + bank.account.getAccountType());
        System.out.println("IFSC Code         : " + bank.account.getIFSCCode());
        System.out.println("Interest Rate (%) : " + bank.getInterestRate());
        System.out.println("Withdrawal Limit  : ₹" + bank.getWithdrawalLimit());
    }
}
