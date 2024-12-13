package inheritance;

public class Main {

	public static void main(String[] args) {
		// Credit Card Payment
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		creditCardPayment.transactionId = "TXN12345";
		creditCardPayment.amount = 10000;
		creditCardPayment.cardNumber = "1234-5678-9012-3456";
		creditCardPayment.expiryDate = "12/26";
		creditCardPayment.processPayment();
		System.out.println();

		// UPI Payment
		UPIPayment upiPayment = new UPIPayment();
//		upiPayment.amount
	}

}
