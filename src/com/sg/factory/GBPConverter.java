package com.sg.factory;

public class GBPConverter implements CurrencyConverter {
	private static double currentCurrencyValue = 107.17;

	@Override
	public double convertToINR(double amount) {

		return amount * currentCurrencyValue;
	}
}
