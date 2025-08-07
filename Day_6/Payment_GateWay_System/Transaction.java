package Day_6.Payment_GateWay_System;

public class Transaction {

    // Private data members (encapsulated)
    private String transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    // Setter and Getter methods

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    // Method to display transaction summary
    public void displayTransactionSummary() {
        System.out.println("----- Transaction Summary -----");
        System.out.println("Transaction ID     : " + transactionId);
        System.out.println("Payer Name         : " + payerName);
        System.out.println("Payee Name         : " + payeeName);
        System.out.println("Amount             : ₹" + amount);
        System.out.println("Payment Method     : " + paymentMethod);
        System.out.println("Transaction Status : " + transactionStatus);
        System.out.println("--------------------------------");
    }
}

