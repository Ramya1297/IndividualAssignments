package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Book;
public interface BookDao extends JpaRepository<Book, Integer>{


}
