/*
 8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).
 */

package day_10.bankAccount;

import java.util.ArrayList;

public class BankAccount {
    int acccountNo;
    String accountHolder;
    double balance;
    double interest;
    static ArrayList<BankAccount> account = new ArrayList<>();
    BankAccount(int acccountNo,String accountHolder,double balance,double interest){
        this.acccountNo = acccountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interest = interest;
    }
}
