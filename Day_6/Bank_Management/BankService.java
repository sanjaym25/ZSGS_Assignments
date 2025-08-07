package Day_6.Bank_Management;

import java.util.ArrayList;

public class BankService{
    static ArrayList<BankAccount> account = new ArrayList<>();
    public void createAccount(String accountHolderName,double amount ,String accountType){
        String transition = "{Account Holder Name : "+accountHolderName+" , Deposite  : "+amount+" Balance : "+amount+" } \n";
        BankAccount acc = new BankAccount(accountHolderName, generateAccount(),amount,transition,"SIBN2574",accountType);
        account.add(acc);
        System.out.println("*******         Account Created SuccessFully      *****");
        System.out.println("Account Number Note It : "+acc.getAccountNumber());
    }
    public void getAccount(String accountNo){
        for(BankAccount acc : account){
            if(acc.getAccountNumber().equals(accountNo));{
                System.out.println("*******        Account Details   *******");
                System.out.println("Account Holder Name : "+acc.getAccountHolderName());
                System.out.println("Account Number : "+acc.getAccountNumber());
                System.out.println("IFSC Code : "+acc.getIfscCode());
                System.out.println("Account Type : "+acc.getAccountType());
                System.out.println("Balance : "+acc.getBalance());
            }
        }
    }
    public void checkBalance(String accNo){
        for(BankAccount account : BankService.account){
            if(account.getAccountNumber().equals(accNo)){
                System.out.println("Balnace : "+account.getBalance());
            }
        }
    }
    public void showAllAcounts(){
         System.out.println("*******        All Account Details   *******");
        for(BankAccount acc : account){
                System.out.print("{ Account Holder Name : "+acc.getAccountHolderName());
                System.out.print(", Account Number : "+acc.getAccountNumber());
                System.out.print(", IFSC Code : "+acc.getIfscCode());
                System.out.print(", Account Type : "+acc.getAccountType());
                System.out.println(", Balance : "+acc.getBalance()+" }");
        }
    }
    public String generateAccount(){
        int min = 1000;
        int max = 10000;
        String accNo = ("365610800"+((int)(Math.random()*(max-min)+1)+min));
        for(BankAccount acc : account){
            if(acc.getAccountNumber().equals(accNo)){
                generateAccount();
            }
        }
        return accNo;
    }
}
