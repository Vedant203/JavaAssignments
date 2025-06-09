package bankapp.model;

public abstract class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private final String BANK_NAME = "";
	private static int accountCount;
	
	public abstract double calculateInterest(double interestRate);

	public final String getBank_Name() {
		return BANK_NAME;
	}

	public static int getAccountCount() {
		return accountCount;
	}
	
	public void incAccountCount() {
		this.accountCount++;
	}

}
