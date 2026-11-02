package com.languagefundamentals.constructors;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;

	BankAccount(int accountNumber, String accountHolderName, double balance, String branch) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.branch = branch;

	}

	public BankAccount(BankAccount b, int accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = b.balance;
		this.branch = b.branch;

	}

	public static void main(String[] args) {

		System.out.println("main method started");
		BankAccount b1 = new BankAccount(156, "uma", 200000, "SBI");
		// b1.accountNumber=1545;
		// b1.accountHolderName="uma";
		// b1.balance=30000;
		// b1.branch="UNION";
		b1.display();
		BankAccount b2 = new BankAccount(b1, 1234, "Uma");
		// b2.accountNumber=123;
		// b2.accountHolderName="chay";
		b2.display();

	}

	void display() {
		System.out.println("ACCOUNT NUMBER: " + accountNumber);
		System.out.println("accountHolderName:" + accountHolderName);
		System.out.println("balance:" + balance);
		System.out.println("Branch: " + branch);
	}

}
