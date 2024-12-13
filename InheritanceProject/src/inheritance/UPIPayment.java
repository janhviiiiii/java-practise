package inheritance;

public class UPIPayment extends Payment {
	String upiId;

	public void processPayment() {
		System.out.println("Processing a payment of ₹" + amount);
		System.out.println("Upi Id: " + upiId);
	}
}
