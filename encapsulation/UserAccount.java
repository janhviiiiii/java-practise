package encapsulation;

public class UserAccount {

    public static void main(String[] args) {
        XyzAccount xyzAccount = new XyzAccount();
        double balance = xyzAccount.getBalance((short) 12324); // default int->short(typecast)

        if (balance == -1) {
            System.out.println("Invalid Pin");
        } else {
            System.out.println("Balance: " + balance);
        }
    }

}
