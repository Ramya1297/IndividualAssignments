package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Car;
import com.example.demo.repo.CarDao;



@RestController
@RequestMapping(value="/web")
public class MyController {
	@Autowired
	CarDao cdao;
	@GetMapping("/cars")
	public List<Car> findAll(){
	return cdao.findAll();
		}

	@PostMapping("/cars")
	public Car insert(@RequestBody Car car) {
		return cdao.save(car);
	}
	@DeleteMapping("/cardel")
	public String delete(	@RequestBody int id) {
		 cdao.deleteById(id);
		 return "Success";
	}
	@PutMapping("/carupdate")
	public String update(	@RequestBody Car car ) {
		//bdao.deleteById(id);
		if(cdao.existsById(car.getId())) {
			cdao.save(car);	
		return "Success";
		}
		else {
			return "no such car";
		}
	}
	
}
