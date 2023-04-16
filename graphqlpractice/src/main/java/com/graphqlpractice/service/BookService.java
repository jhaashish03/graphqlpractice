package com.graphqlpractice.service;

import java.util.List;

import com.graphqlpractice.entity.Book;

public interface BookService {

	public Book createBook(Book book);
	
	
	public List<Book> getAll();
	
	
	public Book get(int id);
	
}
 