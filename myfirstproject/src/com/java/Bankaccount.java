package com.java;

public class Bankaccount {
	int account_number;
	String accountholdername;
	int balance;
	
	static int accountNoGenerater = 123456;
	{
		 
		accountNoGenerater++ ;
		account_number=accountNoGenerater;

	
	}

	public static void main(String[] args) {
		Bankaccount b1 = new Bankaccount();
		b1.accountholdername = "UMA";
		b1.balance = 200000;
		System.out.println("Account number"+b1.account_number);
		System.out.println("Account Holder Name"+b1.accountholdername);
		System.out.println("Account Balance"+b1.balance);
		
		Bankaccount b2 = new Bankaccount();
		b2.accountholdername = "UMA";
		b2.balance = 200000;
		System.out.println("Account number"+b2.account_number);
		System.out.println("Account Holder Name"+b2.accountholdername);
		System.out.println("Account Balance"+b2.balance);
	}
	

}
