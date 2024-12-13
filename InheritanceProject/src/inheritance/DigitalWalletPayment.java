package inheritance;

public class DigitalWalletPayment extends Payment {
	String walletName;
	String phoneNumber;
	
	public void processPayment() {
		System.out.println("Processing a payement of ₹"+amount);
		System.out.println("Wallet: "+walletName+" Phone Number: "+phoneNumber);
	}

}
