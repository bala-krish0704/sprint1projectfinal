package com.cg.bookstoremanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity

	@Table(name = "book")
	public class Book {
		@Id
		@Column(name = "book_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long bookId;
		
		@Column(name = "book_name")
		private String bookName;
		
		@Column(name = "book_price")
		private float bookPrice;
		
		@Column(name = "book_category")
		private String bookCategory;
		
		@Column(name = "book_authorName")
		private String authorName;
		
		
		@Column(name="book_description")
		private String description;
		
		@Column(name="publishing_year")
		private String publishingYear;

		public Book() {
			// TODO Auto-generated constructor stub
		}
		public Book(Long bookId, String bookName, float bookPrice, String bookCategory, String authorName,
				String description,String publishingYear) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
			this.bookCategory = bookCategory;
			this.authorName = authorName;
			this.description = description;
			this.publishingYear=publishingYear;
		}

		public Long getBookId() {
			return bookId;
		}

		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public float getBookPrice() {
			return bookPrice;
		}

		public void setBookPrice(float bookPrice) {
			this.bookPrice = bookPrice;
		}

		public String getBookCategory() {
			return bookCategory;
		}

		public void setBookCategory(String bookCategory) {
			this.bookCategory = bookCategory;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPublishingYear() {
			return publishingYear;
		}
		public void setPublishingYear(String publishingYear) {
			this.publishingYear = publishingYear;
		}	

		
	}



