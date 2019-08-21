package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	EmpDBDao empdao;
	
	@RequestMapping("/")
	public String welcome() {
		
		return "welcome.jsp";
	}
	
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAllEmployees() {
		return empdao.findAll().toString();
	}
	@RequestMapping("/displayEmp")
	@ResponseBody
	public Optional<Employee> displayById(int eid) {
				return empdao.findById(eid);
	}
	@RequestMapping("/displayByDesig")
	@ResponseBody
	//autoconfigures
	//the name should be designation only
	public List<Employee> displayByDesignation(String designation) {
				return empdao.findByDesignation(designation);
	}
	@RequestMapping("/displayByName")
	@ResponseBody
	//autoconfigures
	//the name should be designation only
	public List<Employee> displayByName(String name) {
				return empdao.findByName(name);
	}
	@RequestMapping("/sortByAge")
	@ResponseBody
	public List<Employee> sortByAge(@RequestParam String designation){
		return empdao.getEmpsSortedByAge(designation);
		}
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(Employee e) {
		empdao.save(e);
		
		return displayAllEmployees();
		
	}

	@RequestMapping("/update")
	@ResponseBody
	public String update(Employee e) {
		if(empdao.existsById(e.getEid())) {
		empdao.save(e);
		
		return "updated";
		}
		else {
			return "record doesnt exists";
		}
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteEmp(int eid) {
		if(empdao.existsById(eid)) {
		empdao.deleteById(eid);
		
		return "removed";
		}
		else {
			return "record doesnt exists";
		}
		
	}
	
}
