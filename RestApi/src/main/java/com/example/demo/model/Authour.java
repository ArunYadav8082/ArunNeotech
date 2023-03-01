package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "authour_details")
public class Authour {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "author_id")
	private int authourId;
	
	private String firstName;
	private String lastName;
	private String language;
	private String countory;
	
	@OneToOne(mappedBy = "authour")
	@JsonBackReference
	private Book book;

	public Authour(int authourId, String firstName, String lastName, String language, String countory, Book book) {
		super();
		this.authourId = authourId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.countory = countory;
		this.book = book;
	}

	public int getAuthourId() {
		return authourId;
	}

	public void setAuthourId(int authourId) {
		this.authourId = authourId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountory() {
		return countory;
	}

	public void setCountory(String countory) {
		this.countory = countory;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Authour() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Authour [authourId=" + authourId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
				+ language + ", countory=" + countory + ", book=" + book + "]";
	}
	
	

	
	

}
