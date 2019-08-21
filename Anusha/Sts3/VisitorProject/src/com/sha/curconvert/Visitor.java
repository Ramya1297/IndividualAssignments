package com.sha.curconvert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
	@Value("anusha")
	String name;

	@Autowired
	@Qualifier("franc")
CurrencyConvertor cc;
public void getConversion(double num) {
    cc.getExchangerate(num);
	//System.out.println("the converted value is "+x);
}

public CurrencyConvertor getCc() {
	return cc;
}

public void setCc(CurrencyConvertor cc) {
	this.cc = cc;
}

public String getName() {
	return name;
	
	
	
}
}
