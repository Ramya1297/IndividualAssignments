package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/xyz")
	public String demo()
	{
		return "demo";
	}
	@RequestMapping("/abc")
	public String newdemo()
	{
		return "newdemo";
	}

}
