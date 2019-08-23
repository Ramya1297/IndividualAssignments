package com.anu.dept;

public class Emp {
	
	String anme;
	int id;
	Department d;
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public void namedept()
	{
		d.deptName();
	}

}
