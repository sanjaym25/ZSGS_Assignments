package Atm_System_Interface;
public class Atm_Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.readCard();
        atm.rejectCard();
        atm.printReceipt();
        atm.checkBalance();
        atm.deposit();
        atm.withraw();
        atm.verifier();
    }
}
