package com.sg.factory;

public class DollarConverter implements CurrencyConverter {

	private static double currentCurrencyValue = 73.50;

	@Override
	public double convertToINR(double amount) {

		return currentCurrencyValue * amount;
	}

}
