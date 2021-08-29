package com.sg.factory;

public class CurrencyConverterFactory {

	private static final String USD = "USD";
	private static final String GBP = "GBP";

	public static CurrencyConverter getCurrencyConverter(String currency) {
		CurrencyConverter converter = null;

		switch (currency) {
		case USD:
			converter = new DollarConverter();
			break;

		case GBP:
			converter = new GBPConverter();
			break;

		default:
			System.out.println(currency + " currency is currently not supported");
			break;
		}
		return converter;
	}

}
