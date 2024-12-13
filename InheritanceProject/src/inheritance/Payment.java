package inheritance;

//Parent Class
public class Payment {
	String transactionId;
	double amount;

	public void processPayment() {
		System.out.println("Processing a payment of ₹" + amount + " with transaction Id: " + transactionId);

	}
}

//ctrl+shift+F -> format document
//ctrl+space -> hint