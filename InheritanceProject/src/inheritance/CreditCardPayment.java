package inheritance;

public class CreditCardPayment extends Payment {
	String cardNumber;
	String expiryDate;

	public void processPayment() { // method overriding
		System.out.println("Processing a Credit Card Payment of ₹" + amount);
		System.out.println("Card Name: " + cardNumber + " Expiry date: " + expiryDate);

	}

}
