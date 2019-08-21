package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookDao;

@RestController
@RequestMapping(value="/web")

public class MyController {
	@Autowired
	BookDao bdao;
	
	@GetMapping("/books")
	public List<Book> findAll(){
	return bdao.findAll();
		//return null;
		
	}
	
	@PostMapping("/books")

	public Book insert(	@RequestBody Book book) {
		return bdao.save(book);
	}
	
	@DeleteMapping("/bookdel")
	public String delete(	@RequestBody int id) {
		 bdao.deleteById(id);
		 return "Success";
	}
	@PutMapping("/bookupdate")
	public String update(	@RequestBody Book book ) {
		//bdao.deleteById(id);
		if(bdao.existsById(book.getId())) {
			bdao.save(book);	
		return "Success";
		}
		else {
			return "no such book";
		}
	}
	
	@GetMapping(value="/hi")
public String sayHello() {
	return "hiii ramyaaa";
	
}
	
	
}
