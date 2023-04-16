package com.graphqlpractice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphqlpractice.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
