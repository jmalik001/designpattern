package com.sg.builder.model;

public class CurrentAccount implements AccountType {

	private String accountLabel;
	private double dailyWithdrwalLimit;

	public CurrentAccount(String accountLabel, double dailyWithdrwalLimit) {
		super();
		this.accountLabel = accountLabel;
		this.dailyWithdrwalLimit = dailyWithdrwalLimit;
	}

	@Override
	public boolean validateMinimumAcBal(double amount) {
		return amount > 100000;
	}

	@Override
	public String toString() {
		return "CurrentAccount [accountLabel=" + accountLabel + ", dailyWithdrwalLimit=" + dailyWithdrwalLimit + "]";
	}

}
