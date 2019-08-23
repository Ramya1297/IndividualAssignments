package com.anu.assign.cardemo;

public class Sedan extends Car {

	String mode;
	Car c;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	public void display()
	{
		
		System.out.println(this.mode+" "+this.make+" "+this.color);
	}
	
}
