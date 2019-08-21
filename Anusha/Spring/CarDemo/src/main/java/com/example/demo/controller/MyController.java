package com.example.demo.controller;

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

import com.example.demo.model.Car;
import com.example.demo.repo.CarRepo;

@RestController
@RequestMapping(value="/web")
public class MyController {
	@Autowired
	CarRepo repo;
	
	@GetMapping("/cars")
	public List<Car> findAll()
	{
		return repo.findAll();
	}
	
	@PostMapping("/cars")
	public Car createCar(@RequestBody Car car)
	{
		return repo.save(car);
	}
	
	@PutMapping("/cars")
	public String UpdateCar(@RequestBody Car car)
	{
		if(repo.existsById(car.getId()))
		{
			repo.save(car);
			return "Success";
		}
		else
		{
			return "Record Doesn't exist";
		}
		
	}	
	@DeleteMapping("/deletecar/{id}")
	public String removeCar(@PathVariable int id)
	{	
		if(repo.existsById(id))
		{
			System.out.println("Car ID:"+id);
			repo.deleteById(id);
			return "Record deleted";
		}
		
		return "record does not exist";
	}
}
