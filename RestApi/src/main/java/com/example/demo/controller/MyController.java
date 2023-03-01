package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.BookRepository;
import com.example.demo.model.Book;
import com.example.demo.model.BookService;

@RestController
public class MyController {

	@Autowired
	private BookService bookservice; 
	
	@Autowired
	BookRepository repository;

	@GetMapping("/Books")
	private List<Book> getBooks()

	{

//    Book book = new Book();
//	book.setBookid(15);
//	book.setAuthour("Jitender Saini");
//	book.setDescription("This Book Just For Demo");

		// return book;

		return this.bookservice.getAllBooks();
		
	}

	
	  @GetMapping("/Books/{id}")
	  private Book getBook(@PathVariable("id") int id) {
	  return bookservice.getBookId(id); }
	 

	@PostMapping("/Books")
	public Book addBook( @RequestBody Book book) {
		

		/* repository.save(book); */
		Book b = this.bookservice.addBook(book);
		System.out.println(b);
		return b;
	}

	@DeleteMapping("/Books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookservice.deleteBook(bookId);
	}

	// update book Handler
	@PutMapping("/Books/{bookId}")
	public Book updateBook(@RequestBody @ModelAttribute Book book, @PathVariable("bookId") int bookId) {
		System.out.println("UpdateBook putmapping");
		this.bookservice.updateBook1(book, bookId);
		return book;
	}
}
