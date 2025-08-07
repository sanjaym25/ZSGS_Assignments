package Day_7.RBI_System;

public class PNBBank extends RBISystem {
    PNBBank(Customer customer,Account account){
        super(customer, account);
    }
    @Override
    public  double getInterestRate(){
        if(super.account.getAccountType().toLowerCase().equals("savings"))
            return 4;
        return 4.5;    
    }
    @Override
    public double getWithdrawalLimit(){
        if(super.account.getAccountType().toLowerCase().equals("savings"))
            return 20000;
        return 25000;    
    }
}
