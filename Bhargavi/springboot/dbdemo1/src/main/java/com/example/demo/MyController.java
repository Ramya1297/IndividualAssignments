package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	EmpDBDao dao;
	
	@RequestMapping("/")
public String welcome()
{
	return "welcome.jsp";
}
	@RequestMapping("/displayall")
	@ResponseBody
	
	public List<Employee> displayAllEmployees()
	{
		return dao.findAll();
	}
	@RequestMapping("/displayemp")
	@ResponseBody
	public Optional<Employee> displayEmployee(@RequestParam int eid)
	{
		return dao.findById(eid);
	}
	@RequestMapping("/displayByDesig")
	@ResponseBody
	public String displayByDesignation(@RequestParam String designation)
	{
		return dao.findByDesignation(designation).toString();
	}
	@RequestMapping("/displayByAge")
	@ResponseBody
	public List<Employee> displayEmpByAge(@RequestParam String designation)
	{
		return dao.getEmployeesInSortedByAge(designation);
	}
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String createEmp(Employee emp)
	{
		dao.save(emp);
		return "successfully inserted the record";
	}
	
	@RequestMapping("/updateEmp")
	@ResponseBody
	public String updateEmp(Employee emp)
	{
		int id=emp.getEid();
		if(dao.existsById(id))
		{
			dao.save(emp);
			return "successfully updated the record";
		}
		else
			return "invalid data";
	}
	@RequestMapping("/deleteEmp")
	@ResponseBody
	public String deleteEmp(Employee emp)
	{
		int id=emp.getEid();
		if(dao.existsById(id))
		{
			dao.delete(emp);
			return "successfully deleted the record";
		}
		else
			return "invalid data";
	}
	
}
