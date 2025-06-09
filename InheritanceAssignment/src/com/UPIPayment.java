package com;

public class UPIPayment extends Payment {

	private String upiId;

	public UPIPayment(int paymentID, double payment, String upiId) {
		super(paymentID, payment);
		this.upiId = upiId;
	}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI Payment...");
		System.out.println("Payment ID: "+paymentID);
		System.out.println("Amount: "+payment);
		System.out.println("UPI ID: "+	upiId);
		System.out.println("Payment completed successfully");
	}
	
	
	
}
