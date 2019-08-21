package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/xyz")
	public String demo() {
		
		return "abc";
	}
	
	@RequestMapping("/lunch")
	public String check() {
		return "demo";
	}
}
