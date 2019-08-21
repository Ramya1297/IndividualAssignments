package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.websocket.server.PathParam;
@RestController
@RequestMapping("/rest")
public class MyRestController {
	@Autowired
	EmpDBDao empdao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return empdao.findAll();
		
	}
	@GetMapping("/employee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable("eid") int id) {
		return empdao.findById(id);
		
	}

}
