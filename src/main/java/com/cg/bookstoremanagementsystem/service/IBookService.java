package com.cg.bookstoremanagementsystem.service;

import java.util.List;

import com.cg.bookstoremanagementsystem.entity.Book;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;




public interface IBookService {
	public Book addBook(Book book);
	public List<Book> listAllBooks();
	public Book getBookById(Long bookId)  throws ResourceNotFoundException;
	public Book updateBook(Book book,Long bookId) throws ResourceNotFoundException;
	public void deleteBook(Long bookId);
	public Book findByBookName(String bookName) ;
	public List<Book> findByBookCategory(String bookCategory);
	public List<Book> findByBookPriceLessThan(float bookPrice);
	public List<Book> findByBookPriceGreaterThan(float bookPrice);
	public List<Book> findByAuthorName(String authorName);
	public List<Book> findByDescription(String description);
	public List<Book> findByPublishingYear(String publishingYear);
	
	
}
