package com.rt;
import org.springframework.beans.factory.annotation.Autowired;

public class INRtoDollarConverter implements CurrencyConverter{
	
	@Override
	public void ConvertCurrency(double num) {
		System.out.println(num/70);
	}

}
