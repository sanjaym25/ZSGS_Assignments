package Day_7.RBI_System;

public class SBIBank extends RBISystem {
    SBIBank(Customer customer,Account account){
        super(customer, account);
    }
    public  double getInterestRate(){
        if(super.account.getAccountType().equals("savings"))
            return 4.5;
        return 5;    
    }
    public double getWithdrawalLimit(){
        if(super.account.getAccountType().equals("savings"))
            return 10000;
        return 15000;    
    }
} 
