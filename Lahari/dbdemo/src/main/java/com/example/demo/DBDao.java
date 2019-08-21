package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DBDao extends JpaRepository<Employee,Integer>  {
	public List<Employee> findByDesignation(String designation);
	@Query("from Employee where designation=?1 order by age")
	public List<Employee>getEmployeesSortedByAge(String designation);
	
}