package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int bookId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	@JsonManagedReference
	private Authour authour;
	
	private String description;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Authour getAuthour() {
		return authour;
	}
	public void setAuthour(Authour authour) {
		this.authour = authour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", authour=" + authour + ", description=" + description + "]";
	}
	public Book(int bookId, Authour authour, String description) {
		this.bookId = bookId;
		this.authour = authour;
		this.description = description;
	}
	public Book() {
	}

	
}
