/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abridge
 *
 */

@RestController
@RequestMapping(value="/web")

public class MyController {
	
	
	@GetMapping(value="hi")
	public String sayHello() {
		return "Hello World";
	}

}

