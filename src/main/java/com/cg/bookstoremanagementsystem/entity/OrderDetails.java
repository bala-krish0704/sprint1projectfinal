package com.cg.bookstoremanagementsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderDetailsId;
	
	@Column(name = "Reader_id")
	private Long readerId;
	@Column(name = "Seller_id")
	private Long sellerId;
	
	@Column(name = "Quantity")
	private Long quantity;
	
	@Column(name = "Total_Cost")
	private double totalCost;
	
	@Column(name = "Book_id")
	private Long bookId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "order_id")
	private Order order;

	public OrderDetails() {
		super();
	}

	public OrderDetails(Long readerId, Long sellerId, double totalCost, Long quantity, Long bookId) {
		super();
		this.readerId = readerId;
		this.sellerId = sellerId;
		this.totalCost = totalCost;
		this.quantity = quantity;
		this.bookId = bookId;
	}

	public Long getReaderId() {
		return readerId;
	}


	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}


	public Long getOrderDetailsId() {
		return orderDetailsId;
	}


	public void setOrderDetailsId(Long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", readerId=" + readerId + ",  quantity=" + quantity + ", totalCost=" + totalCost + ", sellerId="
				+ sellerId + ", order=" + order + ", bookId=" + bookId +"]";
	}

}