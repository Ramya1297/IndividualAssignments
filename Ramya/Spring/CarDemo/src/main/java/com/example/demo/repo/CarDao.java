package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Car;

public interface CarDao extends JpaRepository<Car, Integer> {

}
