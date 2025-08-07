package day_10.bankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);  
      int choice; 
      String name;
      int acccountNo;
      double balance;
      double interest;
      BankAccount account = null;
      do{
        System.out.println("1. Create Acccount And AutoBoxing ");
        System.out.println("2. Manual Boxing to Convert a Primitive ");
        System.out.println("3. Unbox the values (both automatic and manual)");
        System.out.println("4. Dispaly Account ");
        System.out.println("5. Show the new balance using primitive values (unboxed) ");
        System.out.println("6. Exit");
        choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1:
                //Create Acccount
                System.out.print("Enter The Account Holder Name : ");
                name = scan.nextLine();
                
                System.out.print("Enter The Account Number : ");
                acccountNo = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter The Amount  : ");
                balance = scan.nextDouble();

                System.out.print("Enter The Interset %  : ");
                interest = scan.nextDouble();
                interest = (balance*interest)/100;
                account = new BankAccount(acccountNo, name, balance, interest);
                // Add The Account Details In ArrayList
                BankAccount.account.add(account);

                break;
        
            case 2:
                System.out.print("Enter The Account Holder Name : ");
                name = scan.nextLine();
                
                System.out.print("Enter The Account Number : ");
                acccountNo = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter The Amount  : ");
                balance = scan.nextDouble();

                System.out.print("Enter The Interset %  : ");
                interest = scan.nextDouble();
                interest = (balance*interest)/100;
                // Manual Boxing (Double)
                account = new BankAccount(acccountNo, name,(Double) balance, (Double)interest);
                // Add The Account Details In ArrayList
                BankAccount.account.add(account);
                break;

            case 3:
                interest = account.interest;
                System.out.println("Manual Convert To Double to double Balance : "+(double) account.balance); 
                System.out.println("AutomAtic Convert To Double to double Balance : "+interest); 
                break;
            case 4 :
                for(BankAccount acc : BankAccount.account){
                    System.out.println("Account Holder Name : "+acc.accountHolder);
                    System.out.println("Account Number : "+acc.acccountNo);
                    System.out.println("Account Interset : "+acc.interest);
                    System.out.println("Account Balance : "+acc.balance);
                } 
                break;
            case 5:
                for(BankAccount acc : BankAccount.account){
                    System.out.println("Account New  Balance : "+acc.balance+acc.interest);
                } 

            default:
                break;
        }
      }
      while(choice !=6);  
      scan.close(); 
    }
}
