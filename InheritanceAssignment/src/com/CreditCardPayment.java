package com;

public class CreditCardPayment extends Payment {
	
	private String cardNumber;
	private int cvv;
	public CreditCardPayment(int paymentID, double payment, String cardNumber, int cvv) {
		super(paymentID, payment);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		super.processPayment();
		System.out.println("Processing Credit Card Payment...");
		
		System.out.println("Payment ID: "+paymentID);
		System.out.println("Amount: "+payment);
		System.out.println("Card number: **** **** **** "+cardNumber.substring(cardNumber.length()-4));
		System.out.println("Payment Completed Successfully");
		
	}
	
	
	
	
}
