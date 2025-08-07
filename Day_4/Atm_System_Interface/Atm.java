package Atm_System_Interface;

public class Atm implements CardReader,PinVerifier,ReceiptPrinter,TransactionHandler{
    public void readCard(){
        System.out.println("Read Card");
    }
    public void rejectCard(){
        System.out.println("Reject Card");
    } 
    public void verifier(){
        System.out.println("Verifier Pin");
    }
    public void  printReceipt(){
        System.out.println("SuccessFully Receipt");
    }
    public void withraw(){
        System.out.println("Withraw Successfully");
    }
    public void deposit(){
        System.out.println("deposit Successfully");
    }
    public void checkBalance(){
        System.out.println("Check Balance");
    }
}
