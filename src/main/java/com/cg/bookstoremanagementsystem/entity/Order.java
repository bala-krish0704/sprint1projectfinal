package com.cg.bookstoremanagementsystem.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order{
	
	@Id
	@Column(name="order_id")
	private String orderId;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "prepare_time")
	private Long prepTime;
	


	public Order() {
		super();
	}
	public Order(String orderId, String orderStatus, Date orderDate, Long prepTime) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.prepTime = prepTime;
	}



	public Long getPrepTime() {
		return prepTime;
	}


	public void setPrepTime(Long prepTime) {
		this.prepTime = prepTime;
	}


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", prepTime=" + prepTime + "]";
	}
}