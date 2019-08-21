package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/web")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/employees")
	public Employee createEmployee(@RequestParam String name, @RequestParam String empId)
	{
		return service.createEmployee(name,empId);
	}
	@RequestMapping(value="/employee")
	public String  helloworld()
	{
		return ("hi anusha");
	}
	

}
