package Day_6.Bank_Management;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String transtionsHistory;
    private String ifscCode;
    private String accountType;
    BankAccount(){

    }
    public BankAccount(String accountHolderName, String accountNumber, double balance, String transtionsHistory,String ifscCode, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber=accountNumber;
        this.balance = balance;
        this.transtionsHistory= transtionsHistory;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getTranstionsHistory() {
        return transtionsHistory;
    }
    public void setTranstionsHistory(String transtionsHistory) {
        this.transtionsHistory = transtionsHistory;
    }
    public void deposit(String accountNo, double depositAmount){
        boolean check = true;
        for(BankAccount account : BankService.account){
            if(account.getAccountNumber().equals(accountNo)){
                account.setBalance(account.getBalance()+depositAmount);
                account.setTranstionsHistory(account.getTranstionsHistory()+"{Account Holder Name : "+account.getAccountHolderName()+" , Deposite  : "+depositAmount+" Balance : "+account.getBalance()+" } \n");
                check = false;

                System.out.println("***         Deposit SuccessFully       ****");
            }
        }
        if(check) System.out.println("****      Account No Miss match    ******");
    }
    public void withraw(String accountNo, double withrawAmount){
        boolean check = true;
        for(BankAccount account : BankService.account){
            if(account.getAccountNumber().equals(accountNo)){
                if(account.getBalance()>=withrawAmount){
                account.setBalance(account.getBalance()-withrawAmount);
                account.setTranstionsHistory(account.getTranstionsHistory()+"{Account Holder Name : "+account.getAccountHolderName()+" , Withraw Amount  : "+withrawAmount+" Balance : "+account.getBalance()+" } \n");
                check = false;

                System.out.println("***         Withraw SuccessFully       ****");
                }
                else{
                    System.out.println("****    Check Balance     *****");
                }
            }
        }
        if(check) System.out.println("****      Account No Miss match    ******");
    }

    public void transtionsHistory(String accountNo){
        boolean check = true;
        for(BankAccount account : BankService.account){
            if(account.getAccountNumber().equals(accountNo)){
                System.out.println(account.getTranstionsHistory());
            }
        }
        if(check){
            System.out.println("***      Account Number Miss Match     ****");
        }
    }
}
