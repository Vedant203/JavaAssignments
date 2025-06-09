package com;

public class PaymentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment creditCardPayement = new CreditCardPayment(101, 100, "1234567891011213", 433);
		DebitCardPayment debitCardPayment = new DebitCardPayment(102, 200, "1212234234237568", 1432);
		UPIPayment upiPayment = new UPIPayment(103, 250, "john@hdfcbank");
		
		
		creditCardPayement.processPayment();
		debitCardPayment.processPayment();
		upiPayment.processPayment();
		
	}

}
