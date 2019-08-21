package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController("/web")
public class EmployeeController {
	
	
	
	public EmployeeController() {
		super();
		System.out.println("constr");
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EmployeeService service;

	@PostMapping(value="/employees")
	public Employee createEmployee(@RequestBody String name,@RequestBody String empId)
	{
		//System.out.println("hi");
		return service.createEmployee(name, empId);
	}

}

