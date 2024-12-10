package encapsulation;

public class XyzAccount {
    private String accountHolder = "XYZ";
    private double balance = 10000;
    private short actualPin = 1234;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance(short userPin) {
        //adding validation to getBalance method
        if(userPin == actualPin)
        {
            return balance;
        }
        return -1; //incorrect pin
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
