package com.sg.builder;

import com.sg.builder.model.BankAccount;

public class Main {

	public static void main(String... args) {
		BankAccount bankAccount = new AccountBuilder().bankAccountNumber(12121)
				.accountType(new AccountTypeBuilder().accountLabel("savings").dailyWithdrwalLimit(5000).build())
				.branch("Marathalli").balance(50000).build();

		System.out.println(bankAccount);
	}

}
