package com.cg.bookstoremanagementsystem.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookstoremanagementsystem.entity.Book;




@Repository
public interface BookRepository extends JpaRepository <Book, Long>  {
public Book findByBookName(String bookName);
	
	public List<Book> findByBookCategory(String bookCategory);
	//list all book which are less than book price
			//select * from book where book_price < ?
			public List<Book> findByBookPriceLessThan(float bookPrice);
			
			//list all books which are less than book price
			//select * from book where book_price > ?
			public List<Book> findByBookPriceGreaterThan(float bookPrice);
			
			public List<Book> findByAuthorName(String authorName);
			public List<Book> findByDescription(String description);
			public List<Book> findByPublishingYear(String publishingYear);

	
}
