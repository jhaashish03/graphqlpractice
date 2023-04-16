package com.graphqlpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphqlpractice.dao.BookRepository;
import com.graphqlpractice.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	


	

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		
		return this.bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		
		return this.bookRepository.findAll();
	}

	@Override
	public Book get(int id) {
		// TODO Auto-generated method stub
		return this.bookRepository.findById(id).get();
	}

}
