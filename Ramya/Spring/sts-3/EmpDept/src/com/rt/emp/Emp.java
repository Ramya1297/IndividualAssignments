package com.rt.emp;

public class Emp  {
String ename;
int id;
Dept dept;
public Dept getDept() {
	return dept;
}
public void setDept(Dept d) {
	this.dept=d;
}
public void getDeptName() {
	dept.getDname();
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
