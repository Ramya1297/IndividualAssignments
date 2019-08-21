package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	public Employee createEmployee( String name,  String empId)
	{
		Employee e=new Employee();
		e.setEmpId(empId);
		e.setName(name);
		return e;
	}
	public void deleteEmployee(@RequestParam  String empId)
	{
		System.out.println("record deleted");
	}

}
