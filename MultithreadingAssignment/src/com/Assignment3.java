package com;

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(String atmName, int amount) {
        if (balance >= amount) {
            System.out.println(atmName + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println(atmName + " attempted to withdraw but insufficient balance.");
        }
    }
}

public class Assignment3 implements Runnable {
	BankAccount account;
    String name;

    Assignment3(BankAccount acc, String name) {
        this.account = acc;
        this.name = name;
    }

    public void run() {
        account.withdraw(name, 300);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(new Assignment3(account, "ATM-1"));
        Thread t2 = new Thread(new Assignment3(account, "ATM-2"));
        Thread t3 = new Thread(new Assignment3(account, "ATM-3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
