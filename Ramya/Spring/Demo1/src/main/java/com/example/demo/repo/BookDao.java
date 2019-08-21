package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository

public interface BookDao extends JpaRepository<Book, Integer>{
	public Optional <Book> findById(Integer id);

	public Book save(Book book);

	public List<Book> findAll();

	boolean existsById(Integer id);

	void deleteById(Integer id);
	
}
