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
	EmpDBDao  dao;
	DeptDBDao deptDao;
	
	
@RequestMapping("/")
public String welcome()
{
	return "welcome.jsp";
}
@RequestMapping("/displayAll")
@ResponseBody
public String display()
{
	return dao.findAll().toString();
}
@RequestMapping("/displayEmp")
@ResponseBody
public String displayEmp(@RequestParam("emp_id") int eid)
{
	return dao.findById(eid).toString();
}

@RequestMapping("/displayDesig")
@ResponseBody
public String displayEmployeeByDesig(String designation)
{
	//dao.findById(id)
	return dao.findByDesignation(designation).toString();
}

@RequestMapping("/displayByage")
@ResponseBody
public List<Employee> displayByAge(@RequestParam String designation)
{
	//dao.findById(id)
	return dao.getEmployeesInsorted(designation);
}

@RequestMapping("/insertEmp")
@ResponseBody
public String createEmployee(Employee emp)
{
	//dao.findById(id)
	dao.save(emp);
	return "Succesfully inserted";
}

@RequestMapping("/collect")
@ResponseBody
public String collect(@RequestParam int eid, String mgr)
{
	Employee e=dao.findById(eid).orElse(new Employee());
	Department d=deptDao.findByManager(mgr);
	return "";
}

@RequestMapping("/updateEmp")
@ResponseBody
public String updateEmp(Employee emp)
{
int id=emp.getEid();
if(dao.existsById(id))
{
dao.save(emp);
return "succesfully updated";
}
return "sorry invalid id";
}

@RequestMapping("/deleteEmp")
@ResponseBody
public String deleteEmp(@RequestParam int eid)
{
  if(dao.existsById(eid))
{
dao.deleteById(eid);
return "succesfully deleted";
}
return "sorry invalid id";
}


}
