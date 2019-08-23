package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpDBDao extends JpaRepository<Employee, Integer>{
public List<Employee> findByDesignation(String Designation);
@Query("from Employee where designation=?1 order by age")
public List<Employee> getEmployeesInSortedByAge(String designation);
}
