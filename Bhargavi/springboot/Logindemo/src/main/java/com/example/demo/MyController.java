package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/")
public String login()
{
	return "login.jsp";
}
	@RequestMapping("/greet")
public ModelAndView greet(User user,User pass)
{
		String username= user.getUname();
		String password=user.getUpass();
		
		ModelAndView mv=new ModelAndView();
		if(username.equals(password))
		{
		mv.addObject("obj",user);
		mv.addObject("msg","successfully logged in!");
		mv.setViewName("welcome.jsp");
		}
		else
		{
			mv.setViewName("error.jsp");
		}
	return mv;
}
}
