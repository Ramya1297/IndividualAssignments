package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpDBDao extends JpaRepository<Employee, Integer>  {
//userdefined method
	public List<Employee> findByDesignation(String designation);
	public List<Employee> findByName(String name);
	//jpql
	@Query("from Employee where designation=?1 order by age desc")
	public List<Employee> getEmpsSortedByAge(String designation);
	
}
