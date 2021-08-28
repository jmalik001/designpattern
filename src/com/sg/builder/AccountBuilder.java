package com.sg.builder;

import com.sg.builder.model.AccountType;
import com.sg.builder.model.BankAccount;

public class AccountBuilder {
	private int bankAccountNumber;
	private String branch;
	private double balance;

	private AccountType accountType;

	public AccountBuilder() {
		
	}
	
	public AccountBuilder bankAccountNumber(int bankAccNumber) {
		this.bankAccountNumber = bankAccNumber;
		return this;
	}

	public AccountBuilder branch(String branch) {
		this.branch = branch;
		return this;
	}

	public AccountBuilder balance(int balance) {
		this.balance = balance;
		return this;
	}

	public AccountBuilder accountType(AccountType acType) {
		this.accountType = acType;
		return this;
	}

	public BankAccount build() {
		return new BankAccount(bankAccountNumber, branch, balance, accountType);
	}

}
