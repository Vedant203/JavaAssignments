package bankapp.model;

import bankapp.util.Transaction;

public class Account extends BankAccount implements Transaction {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(int accountNumber, String accountHolderName, double balance) {
		super();
		incAccountCount();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double calculateInterest(double interestRate) {
		// TODO Auto-generated method stub
		return interestRate*this.balance*0.01;
		
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.out.println("Enter a valid amount");
		}
		else {
			this.balance+=amount;
		System.out.println(amount+" amount deposited");
		}
	}
	@Override
	public void withdrawl(double amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.out.println("Enter a valid amount");
		}
	else if(this.balance>=amount) {
			this.balance-=amount;
			System.out.println(amount+" amount withdrawn");
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
}
