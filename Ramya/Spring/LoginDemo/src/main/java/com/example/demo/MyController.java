package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

@RequestMapping("/")
public String login() {
	return "login";
}
@RequestMapping("/greet")
public ModelAndView greet(User user) {
		/*
		 * String user= request.getParameter("uname"); String pass=
		 * request.getParameter("upass"); System.out.println(user);
		 * System.out.println(pass); HttpSession session=request.getSession();
		 * session.setAttribute("username", user);
		 */
	//session.setAttribute("user",user);
	//String msg="hiii";
	//mv.addObject("str",msg);
String username=user.getUname();
String password=user.getUpass();

ModelAndView mv=new ModelAndView(); 
if(username.equals(password)) {
	
	mv.addObject("obj",user);
	mv.addObject("msg","Successfully logged in");
	mv.setViewName("welcome");	
}
else {
	mv.setViewName("invalid");
}
return mv;
}
}
