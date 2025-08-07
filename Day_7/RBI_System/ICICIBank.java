package Day_7.RBI_System;

public class ICICIBank extends RBISystem {
    ICICIBank(Customer customer,Account account){
        super(customer, account);
    }
    public  double getInterestRate(){
        if(super.account.getAccountType().equals("savings"))
            return 5.5;
        return 6;    
    }
    public double getWithdrawalLimit(){
        if(super.account.getAccountType().equals("savings"))
            return 15000;
        return 20000;    
    }
}
