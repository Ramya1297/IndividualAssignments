package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	HttpSession session;
	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	/*
	@RequestMapping("/greet")
	public String greet(HttpServletRequest request )
	{
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		System.out.println("username: "+user+"\n"+"password: "+pass);
		HttpSession session=request.getSession();
		session.setAttribute("username", user);
		return "welcome.jsp";
	}
	
	@RequestMapping("/greet")
	public String greet(String uname, String pass )
	{
	
	
	
		//System.out.println("username: "+user+"\n"+"password: "+pass);
		//HttpSession session=request.getSession();
		session.setAttribute("username", uname);
		return "welcome.jsp";
	}
	*/
	@RequestMapping("/greet")
	public ModelAndView greet(User user )
	{
		String str="successfully logged in";
		String uname=user.getUname();
		String pass=user.getPass();
		ModelAndView mv=new ModelAndView();
		if(uname.equals(pass))
		{
			mv.addObject(user);
			mv.addObject("msg",str);
			mv.setViewName("welcome.jsp");
			return mv;
		}
		//session.setAttribute("user", user);
		else
		{
			mv.setViewName("invalid.jsp");	
			return mv;
		}
		
		
	}
	

}
