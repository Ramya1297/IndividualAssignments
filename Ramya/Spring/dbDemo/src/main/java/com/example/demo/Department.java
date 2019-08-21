package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	int deptid;
	String name;
	String manager;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + ", manager=" + manager + "]";
	}
	
	
}
