package com.sg.builder;

import com.sg.builder.model.AccountType;
import com.sg.builder.model.CurrentAccount;
import com.sg.builder.model.SavingsAccount;

public class AccountTypeBuilder {

	private String accountLabel;
	private double dailyWithdrwalLimit;

	public AccountTypeBuilder accountLabel(String accountLabel) {
		this.accountLabel = accountLabel;
		return this;
	}

	public AccountTypeBuilder dailyWithdrwalLimit(double dailyWithdrwalLimit) {
		this.dailyWithdrwalLimit = dailyWithdrwalLimit;
		return this;
	}

	public AccountType build() {
		return "Savings".equalsIgnoreCase(accountLabel) ? new SavingsAccount(accountLabel, dailyWithdrwalLimit)
				: new CurrentAccount(accountLabel, dailyWithdrwalLimit);
	}

}
