package com.rt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
public class User {
	@Value("ramya")
String name;
	@Autowired
	@Qualifier("franc")
CurrencyConverter cc;
public void getConversion(double num) {
    cc.ConvertCurrency(num);
	//System.out.println("the converted value is "+x);
}

public CurrencyConverter getCc() {
	return cc;
}

public void setCc(CurrencyConverter cc) {
	this.cc = cc;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
