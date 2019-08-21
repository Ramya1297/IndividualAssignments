package com.rt;

public class INRtoFrancConverter implements CurrencyConverter{

	@Override
	public void ConvertCurrency(double num) {
		System.out.println(num/10);
	}

}
