package com.sg.builder.model;

public class BankAccount {

	private int bankAccountNumber;
	private String branch;
	private double balance;
	
	private AccountType accountType;

	public BankAccount(int bankAccountNumber, String branch, double balance) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.branch = branch;
		this.balance = balance;
	}

	public BankAccount(int bankAccountNumber, String branch, double balance, AccountType accountType) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.branch = branch;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNumber=" + bankAccountNumber + ", branch=" + branch + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}

	
		
	
}
