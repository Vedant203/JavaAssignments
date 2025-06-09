package com;

public class DebitCardPayment extends Payment {
	
	private String cardNumber;
	private int pin;
	public DebitCardPayment(int paymentID, double payment, String cardNumber, int pin) {
		super(paymentID, payment);
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing Debit Card Payment...");
		System.out.println("Payment ID: "+paymentID);
		System.out.println("Amount: "+payment);
		System.out.println("Card number: **** **** **** "+cardNumber.substring(cardNumber.length()-4));
		System.out.println("Payment completed successfully");
	}
	
	
	
	
}
