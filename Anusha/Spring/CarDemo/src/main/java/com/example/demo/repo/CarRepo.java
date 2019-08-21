package com.example.demo.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
	
	public Optional <Car> findById(Integer id);

	public Car save(Car car);

	public List<Car> findAll();
	

	boolean existsById(Integer id);

	void deleteById(Integer id);


	
}
