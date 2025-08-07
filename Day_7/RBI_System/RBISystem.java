package Day_7.RBI_System;

public abstract class RBISystem {
    Customer customer;
    Account account;
    RBISystem(Customer customer,Account account){
        this.customer = customer;
        this.account = account;
    }
    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
}
