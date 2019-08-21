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
	CustomerDao cdao;
	@Autowired
	TransactionDao tdao;
	@Autowired
	AccountDao adao;
	
	@GetMapping("/profile/{acc}")
	
	public String createNewAccount(@PathVariable("acc") Account acc) {
		if(acc.getBalance()>5000)
		adao.save(acc);
		else
			return "balance must be greater than 5000";
		
		return "Success";
		
	}
	//showing my profile
	
	@GetMapping("/login/{cust_id}")
	public String getMyProfileList(@PathVariable("cust_id") int cust_id)  {
		if(cust_id==123 )
		{
		return cdao.findById(cust_id).toString();
		}
		return null;
	}
	

}
