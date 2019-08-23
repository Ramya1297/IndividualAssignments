package com.anu.calcy;

public class User {

	//String name
	Calculator cal;

	public Calculator getCal() {
		return cal;
	}

	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	public void addition(int x, int y)
	{
		System.out.println( cal.add(x, y));
	}
	
	
	
}
