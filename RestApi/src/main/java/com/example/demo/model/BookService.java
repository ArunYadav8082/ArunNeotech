package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Transient;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.BookRepository;
@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list = new ArrayList<>();
	
//	static {
	
		
///	list.add(new Book(12,"java complete Refrence","Abhay Yadav"));
//	list.add(new Book(24,"java script complete Refrence","Aditya Yadav"));
	//	list.add(new Book(36,"Android Refrence","Arun Yadav"));
	//	list.add(new Book(48,"Mechnical complete Refrence","Abhay Yadav"));

	// get all books
	public List<Book> getAllBooks()
	{
		List<Book>list = (List)this.bookRepository.findAll();
		return list;
	}
	//get single book by id
	public Book getBookId(int Bookid)
	{
		Book book = null;
		// book=list.stream().filter(e->e.getBookid()==id).findFirst().get();
	 book = this.bookRepository.findByBookId(Bookid);
		 return book;
	
	
	}
	// add book
	
	@Transient
	public Book addBook(Book b)
	{
		// list.add(b);
		 Book result=bookRepository.save(b);
		return result;
	
	}
	
	// delete book
	public void deleteBook(int bid)
	{
		bookRepository.deleteById(bid);
		//  list = list.stream().filter(book->book.getBookid()!=bid).collect(Collectors.toList());
		
	}	
	
	/*public void updateBook(Book book,int bookId)
	{
		list.stream().map(b->{
			if(b.getBookid()==bookId)
			{
				b.setDescription(book.getDescription());
				b.setAuthour(book.getAuthour());
			}
			return b;
	
		}).collect(Collectors.toList());
	}
	public void updateBook(String book) {
		// TODO Auto-generated method stub
		
	}*/
	  
	
	public void updateBook1(Book book1, int bookId) {
		
		
	    	book1.setBookId(bookId);
		bookRepository.save(book1);
		
	//	for (Book book2 : list) {
			
			
		//	if (book2.getBookid()==book.getBookid()) {
				
			//	book2.setAuthour(book.getAuthour());
		//		book2.setBookid(book.getBookid());
		//		book2.setDescription(book.getDescription());
				
				
			}
			
		
		
	}
	
		
	
	
	
     
	
	


