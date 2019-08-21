package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	CustomerDao cdao;
	@Autowired
	TransactionDao tdao;
	@Autowired
	AccountDao adao;
	
	@RequestMapping("/")
	public String login() {
		
		return "login.jsp";
	}
	
	
	
}
