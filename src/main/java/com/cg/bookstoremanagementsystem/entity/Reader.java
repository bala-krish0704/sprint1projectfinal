package com.cg.bookstoremanagementsystem.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="readers")
public class Reader {

					@Id
					@GeneratedValue(strategy = GenerationType.IDENTITY)
					@Column(name = "readId", nullable = false)
					private Long readerId;
					
					@Column(name="first_name", nullable = false)
					private String firstName;
					
					@Column(name = "last_name", nullable = false)
					private String lastName;
					
					@Column(name = "email", nullable = false)
					private String email;
					
					@Column(name = "username", nullable = false)
					private String username;
					
					@Column(name = "password", nullable = false)
					private String password;
					
					@Column(name = "wallet_balance", nullable = false)
					private double balance;
					
					@Column(name = "number_of_orders")
					private long numberOfOrders;

					public Reader() {
						super();
					}
					
					

					public Reader(String firstName, String lastName, String email, String username, String password) {
						super();
						this.firstName = firstName;
						this.lastName = lastName;
						this.email = email;
						this.username = username;
						this.password = password;
						this.balance = 0;
						this.numberOfOrders = 0;
					}



					public Reader(String firstName, String lastName, String email, String username, String password, double balance, long numberOfOrders) {
						super();
						this.firstName = firstName;
						this.lastName = lastName;
						this.email = email;
						this.username = username;
						this.password = password;
						this.balance = balance;
						this.numberOfOrders = numberOfOrders;
					}


					

					public long getNumberOfOrders() {
						return numberOfOrders;
					}

					public void setNumberOfOrders(long numberOfOrders) {
						this.numberOfOrders = numberOfOrders;
					}

					public String getUsername() {
						return username;
					}



					public void setUsername(String username) {
						this.username = username;
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

					public String getEmail() {
						return email;
					}

					public void setEmail(String email) {
						this.email = email;
					}

					public Long getCustomerId() {
						return readerId;
					}

					public void setCustomerId(Long customerId) {
						this.readerId = customerId;
					}

					public String getPassword() {
						return password;
					}

					public void setPassword(String password) {
						this.password = password;
					}

					public double getBalance() {
						return balance;
					}

					public void setBalance(double balance) {
						this.balance = balance;
					}

					@Override
					public String toString() {
						return "Reader [readerId=" + readerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
								+ email + ", username=" + username + ", password=" + password + ", balance=" + balance
								+ ", numberOfOrders=" + numberOfOrders + "]";
					}

					

					
					
					
				}



