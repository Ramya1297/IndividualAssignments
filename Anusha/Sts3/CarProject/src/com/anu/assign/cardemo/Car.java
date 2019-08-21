package com.anu.assign.cardemo;

public class Car {
	String color;
	String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public  void show()
	{
		System.out.println(this.color+" " +this.make);
	}
}
