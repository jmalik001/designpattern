package com.sg.builder.model;

public class SavingsAccount implements AccountType{

	private String accountLabel;
	private double dailyWithdwalLimit; 
	
	public SavingsAccount(String accountLabel, double dailyWithdwalLimit) {
		super();
		this.accountLabel = accountLabel;
		this.dailyWithdwalLimit = dailyWithdwalLimit;
	}

	@Override
	public boolean validateMinimumAcBal(double amount) {
		return amount>5000;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountLabel=" + accountLabel + ", dailyWithdwalLimit=" + dailyWithdwalLimit + "]";
	}

}
