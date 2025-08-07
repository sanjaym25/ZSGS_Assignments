package Day_7.Payment_Gateway_System;

public class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Amount  Rs."+amount+" through the UPIPayment");
    } 
}
