package com.graphqlpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphqlpractice.entity.Book;
import com.graphqlpractice.service.BookServiceImpl;

@Controller
public class BookController {
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	 	@QueryMapping("allbooks")
	    public List<Book> getall() {
	        return this.bookServiceImpl.getAll();
	    }
	
	 	@QueryMapping("onebook")
	    public Book getone(@Argument int id) {
	        return this.bookServiceImpl.get(id);
	    }
	 
	@SchemaMapping(typeName = "Mutation", field = "addBook")
	 public Book addbook(@Argument String title,@Argument String author) {
		Book b=new Book();
		b.setAuthor(title);
		b.setTitle(author);
		
		 return this.bookServiceImpl.createBook(b);
		 
	 }
}


//class BookInput{
//	public String title;
//	public String author;
//	public BookInput(String title, String author) {
//		super();
//		this.title = title;
//		this.author = author;
//	}
//	@Override
//	public String toString() {
//		return "BookInput [title=" + title + ", author=" + author + "]";
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public BookInput() {
//		super();
//	}
//	
//	
//}
