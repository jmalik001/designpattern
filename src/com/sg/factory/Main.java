package com.sg.factory;

public class Main {

	public static void main(String[] args) {

		double gbpAmount = 500;
		double usdAmount = 700;

		CurrencyConverter gbpCurrencyConverter = CurrencyConverterFactory.getCurrencyConverter("GBP");
		double inrValueFromGBP = gbpCurrencyConverter.convertToINR(gbpAmount);
		System.out.println(gbpAmount + " GBP in INR = " + inrValueFromGBP);

		CurrencyConverter usdCurrencyConverter = CurrencyConverterFactory.getCurrencyConverter("USD");
		double inrValueFromUSD = usdCurrencyConverter.convertToINR(usdAmount);
		System.out.println(usdAmount + " USD in INR = " + inrValueFromUSD);

	}

}
