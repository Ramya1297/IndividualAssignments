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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.CarDao;
import com.example.demo.model.Car;

@RestController
@RequestMapping(value="/web")
public class MyController {

	@Autowired
	CarDao dao;
	
	@RequestMapping("/displayid")
	@ResponseBody
	public Optional<Car> displayCarById(@RequestParam int cid)
	{
		return dao.findById(cid);
	}
	
	@GetMapping("/displayall")
	public List<Car> findAll()
	{    System.out.println("findall");
		return dao.findAll();
	}
	
	@PostMapping("inserting")
	public Car save(@RequestBody Car car)
	{
		return dao.save(car);
	}
	
	
	@PutMapping("/cars")
	public Car updateBook(@RequestBody Car car){
	return dao.save(car);
	}
	
	@DeleteMapping("/cars/{cid}")
	public List<Car> deleteCar(@PathVariable Integer cid) {
		dao.deleteById(cid);
		return dao.findAll();
	}

}
