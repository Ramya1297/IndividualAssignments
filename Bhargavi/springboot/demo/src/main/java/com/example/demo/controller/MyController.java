package com.example.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.BookDao;
import com.example.demo.model.Book;

@RestController
@RequestMapping(value="/web")

public class MyController {

	@Autowired
	BookDao dao;
	@GetMapping("/displayall")
	public List<Book> findAll()
	{
		return dao.findAll();
	}
	
	@PostMapping("inserting")
	public Book save(@RequestBody Book book)
	{
		return dao.save(book);
	}
	
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book){
	return dao.save(book);
	}
	
	@DeleteMapping("/books/{bid}")
	public List<Book> deleteBook(@PathVariable Integer bid) {
		dao.deleteById(bid);
		return dao.findAll();
	}

}
	
	
