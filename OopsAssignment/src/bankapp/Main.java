package bankapp;

import java.util.Scanner;

import bankapp.model.Account;
import bankapp.service.AccountManager;

public class Main {

	public static void main(String[] args) {
		AccountManager accountManager = new AccountManager();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
				System.out.println("Enter choice:");
				System.out.println("1. Add account");
				System.out.println("2. Deposit");
				System.out.println("3. Withdrawl");
				System.out.println("4. Display account detais");
				System.out.println("5. Calculate Interest");
				System.out.println("6. Get account count");
				System.out.println("7. Get Balance");
				System.out.println("8. Exit");
				choice = scanner.nextInt();
				scanner.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter account number: ");
			int accNumber = scanner.nextInt() ;
			if(accountManager.accountExists(accNumber)) {
				System.out.println("Account already exits");
				break;
			}
			System.out.println("Enter account holder name: ");
			String accName = scanner.next();
			System.out.println("Enter balance: ");
			double accBalance = scanner.nextDouble();
			Account account = new Account(accNumber,accName,accBalance);
			accountManager.addAccounts(account);
			break;
		case 2:
			System.out.println("Enter account number: ");
			int accNumber1 = scanner.nextInt();
			Account account1 = accountManager.findAccount(accNumber1);
			if(account1 == null) {
				System.out.println("Enter an existing account number.");
				break;
			}
			System.out.println("Enter amount: ");
			double amount = scanner.nextDouble();
			account1.deposit(amount);
			break;
			
		case 3:
			System.out.println("Enter account number: ");
			int accNumber2 = scanner.nextInt();
			Account account2 = accountManager.findAccount(accNumber2);
			System.out.println("Enter amount: ");
			double amount1 = scanner.nextDouble();
			if(account2 == null) {
				System.out.println("Enter an existing account number.");
				break;
			}
			account2.deposit(amount1);
			break;
		case 4:
			System.out.println("Enter account number: ");
			int accNumber3 = scanner.nextInt();
			Account account3 = accountManager.findAccount(accNumber3);
			if(account3 == null) {
				System.out.println("Enter an existing account number.");
				break;
			}
			System.out.println(account3);
			break;
		case 5:
			System.out.println("Enter account number: ");
			int accNumber4 = scanner.nextInt();
			Account account4 = accountManager.findAccount(accNumber4);
			if(account4 == null) {
				System.out.println("Enter an existing account number.");
				break;
			}
			double interest = account4.calculateInterest(3);
			System.out.println("Interest is: "+interest);
			break;
		case 6:
			System.out.println("Total number of accounts: "+Account.getAccountCount());
			break;
		
		case 7:
			System.out.println("Enter account number: ");
			int accNumber5 = scanner.nextInt();
			Account account5 = accountManager.findAccount(accNumber5);
			if(account5 == null) {
				System.out.println("Enter an existing account number.");
				break;
			}
			double balance = account5.getBalance();
			System.out.println("Balance in account "+account5.getAccountNumber()+": "+account5.getBalance());
			break;
		}}while(choice!=8);
			
	}
	
}
