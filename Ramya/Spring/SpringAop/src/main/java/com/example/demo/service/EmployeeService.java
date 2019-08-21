package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
@Service
public class EmployeeService {
	
public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("service");
	}

public Employee createEmployee(String name,String id) {
	Employee e=new Employee();
	e.setEmpId(id);
	e.setName(name);
	return e;
	
}

public void deleteEmployee(String id) {
	System.out.println("Deleting emp "+id);
}
}
