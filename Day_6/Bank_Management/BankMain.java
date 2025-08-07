/*
 * 5. Design a class named BankAccount that uses the concept of encapsulation. 
 * The class should have the following private data members: account number,
 *  account holder name, and balance. 
 * Provide public getter and setter methods to access and modify these fields. Also, 
 * include a method to deposit and withdrawal of amount ensuring that the balance cannot go negative.
 */
package Day_6.Bank_Management;

import java.util.Scanner;

public class BankMain {
    static Scanner scan = new Scanner(System.in);
    static String accNo;
    static BankAccount user;
    static BankService acc;

    public static void main(String[] args) {
        while (true) {
            System.out.println("***   Welcome To SI Bank      ****");
            System.out.println(
                    "1. Create Account\n2. Deposit\n3. Withraw\n4. Balance\n5. Transition History\n6.Display Account\n7. Display All Account\n8. Exit\n");
            System.out.print("Enter The Choice : ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("****    Create Account     *****");
                    System.out.print("Enter The Account Holder Name : ");
                    String name = scan.nextLine();
                    System.out.print("Enter the Account Type : ");
                    String accType = scan.nextLine();
                    System.out.print("Enter the Initial deposit Amount : ");
                    double deposit = scan.nextDouble();
                    acc = new BankService();
                    acc.createAccount(name, deposit, accType);
                    break;
                case 2:
                    System.out.println("****      Deposit  Page     ****");
                    System.out.print("Enter The Account Number : ");
                    accNo = scan.nextLine();
                    System.out.print("Enter the Deposit Amount : ");
                    double dep = scan.nextDouble();
                    if (dep > 0) {
                        user = new BankAccount();
                        user.deposit(accNo, dep);
                    } else {
                        System.out.println("Deposite Only Greder Than 0 ");
                    }
                    break;
                case 3:
                    System.out.println("****        Withraw Page        *****");
                    System.out.print("Enter The Account Number : ");
                    accNo = scan.nextLine();
                    System.out.print("Enter the Withraw Amount : ");
                    double with = scan.nextDouble();
                    if (with > 0) {
                        user = new BankAccount();
                        user.withraw(accNo, with);
                    } else {
                        System.out.println("Withraw Amount Only Positive");
                    }
                    break;
                case 4:
                    System.out.println("****       Balance Deatils       ****");
                    System.out.print("Enter The Account Number : ");
                    accNo = scan.nextLine();
                    acc = new BankService();
                    acc.checkBalance(accNo);
                    break;
                case 5:
                    System.out.println("******        Transition History      ******");
                    System.out.print("Enter The Account Number : ");
                    accNo = scan.nextLine();
                    user = new BankAccount();
                    user.transtionsHistory(accNo);
                    break;
                case 6:
                    System.out.println("*****       Accout Details     ******");
                    System.out.print("Enter The Account Number : ");
                    accNo = scan.nextLine();
                    acc = new BankService();
                    acc.getAccount(accNo);
                    ;
                    break;
                case 7:
                    System.out.println("****       Account All Details     ****");
                    acc = new BankService();
                    acc.showAllAcounts();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
