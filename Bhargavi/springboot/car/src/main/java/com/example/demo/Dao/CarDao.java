package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Car;

public interface CarDao extends JpaRepository<Car, Integer>{

}
