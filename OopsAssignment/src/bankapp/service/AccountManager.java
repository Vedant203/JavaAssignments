package bankapp.service;

import java.util.ArrayList;
import java.util.List;

import bankapp.model.Account;

public class AccountManager {

	private List<Account> accounts = new ArrayList<>();
	
	public void addAccounts(Account account) {
//		System.out.println("Enter account details");
		for(Account acc:accounts) {
			if(acc.getAccountNumber()==account.getAccountNumber()) {
				System.out.println("Account number taken, enter another account number.");
				return;
			}
		}
		accounts.add(account);
		System.out.println("Account added");
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public Account findAccount(int accountNumber) {
		for(Account account:this.accounts) {
			if(account.getAccountNumber() == accountNumber)return account;
		}
		System.out.println("Enter an existing account number");
		return null;
	}
	
	public boolean accountExists(int accountNumber) {
		for(Account account:this.accounts) {
			if(account.getAccountNumber() == accountNumber)return true;
		}
		return false;
	}

}
