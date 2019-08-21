package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {
	@Autowired
	DBDao dao;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "welcome.jsp";
	}
	
@RequestMapping("/displayAll")
@ResponseBody
public String displayAllEmployees()
{
	return dao.findAll().toString();
}
@RequestMapping("/displayEmp")
@ResponseBody
public String displayEmployee(@RequestParam int eid)
{
	return dao.findById(eid).toString();
}
@RequestMapping("/displayByDesig")
@ResponseBody
public String displayByDesignation(@RequestParam String designation)
{
	return dao.findByDesignation(designation).toString();
}
@RequestMapping("/displayByAge")
@ResponseBody
public String displayEmpByAge(@RequestParam String designation)
{
	return dao.getEmployeesSortedByAge(designation).toString();
}

@RequestMapping("/insertEmp")
@ResponseBody
public String createEmployee(Employee emp)
{
	dao.save(emp);
	return "Successfully inserted";
}
@RequestMapping("/updateEmp")
@ResponseBody
public String deleteEmployee(Employee emp)
{
	int id=emp.getEid();
			
			if(dao.existsById(id)) {
	dao.save(emp);
	return "Successfully updated";
}
			else
return "sorry invalid ID";
}
			
			@RequestMapping("/deleteEmp")
			@ResponseBody
			public String deleteEmployee(int eid)
			{
				
						
						if(dao.existsById(eid)) {
				dao.deleteById(eid);
				return "Successfully removed";
			}
						else
			return "sorry invalid ID";
	

	
}
}
