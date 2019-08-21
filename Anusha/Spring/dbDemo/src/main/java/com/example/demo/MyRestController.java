package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rest")
public class MyRestController {
	@Autowired
	EmpDBDao dao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{	
		return dao.findAll();
		
	}
	@GetMapping("/employees/{eid}")
	public Optional<Employee> getEmployee(@PathVariable int eid)
	{	
		System.out.println("Employee ID:"+eid);
		return dao.findById(eid);
		
	}
	@PutMapping("/employees")
	public String updateEmp(@RequestBody Employee emp)
	{	
		if(dao.existsById(emp.getEid()))
		{
			dao.save(emp);
		}
		else
		{
			return "Record Doesn't exist";
		}
		return "success";
	}
	@PostMapping("/employees")
	public String insertEmp(@RequestBody Employee emp)
	{	
		if(dao.existsById(emp.getEid()))
		{
			return "record already exist";
		}
		else
		{
			dao.save(emp);
			return "record successsfully entered";
		}
		
	}
	
	@DeleteMapping("/employee/{eid}")
	public String removeEmp(@PathVariable int eid)
	{	
		System.out.println("Employee ID:"+eid);
		dao.deleteById(eid);
		return "deleted";
	}
	
}
