package Day_7.RBI_System;

public class Account {
    private String accountNo;
    private String accountType;
    private String IFSCCode;
    public String getAccountNo() {
        return accountNo;
    }
    public Account(String accountNo, String accountType, String iFSCCode) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        IFSCCode = iFSCCode;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getIFSCCode() {
        return IFSCCode;
    }
    public void setIFSCCode(String iFSCCode) {
        IFSCCode = iFSCCode;
    }
}