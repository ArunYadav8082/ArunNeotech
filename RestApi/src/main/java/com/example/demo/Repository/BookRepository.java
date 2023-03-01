package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	Book findByBookId(int bookid);

	/* public Book findByBookid(int Bookid); */

}
