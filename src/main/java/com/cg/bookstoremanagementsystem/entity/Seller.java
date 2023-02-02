package com.cg.bookstoremanagementsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	private Long sellerId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "wallet")
	private Float wallet;
	
	@Column(name = "GSTIN ")
	private Float GSTIN ;
	
	@Column(name = "mobile number")
	private Long mobilenumber;

	public Seller() {
		super();
	}

	public Seller(String firstName, String lastName, String email, String username, String password,
			Float wallet,Float GSTIN,Long mobilenumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.wallet = wallet;
		this.GSTIN = GSTIN;
		this.mobilenumber = mobilenumber;
	}
	
	
	public Seller(Long sellerId, String firstName, String lastName, String email, String username, String password,
			Float wallet,Float GSTIN,Long mobilenumber) {
		super();
		this.sellerId = sellerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.wallet = wallet;
		this.GSTIN = GSTIN;
		this.mobilenumber = mobilenumber;
		
	}

	

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Float getWallet() {
		return wallet;
	}

	public void setWallet(Float wallet) {
		this.wallet = wallet;
	}

	public Float getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(Float GSTIN) {
		this.GSTIN = GSTIN;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", firstName=" + firstName +", lastName=" + lastName + ", email=" + email +", password=" + password + ", wallet=" + wallet + ", GSTIN=" + GSTIN + ", mobilenumber=" + mobilenumber +"]";
	}

	

	public static List<Seller> getAllSeller() {
		// TODO Auto-generated method stub
		return null;
	}

	
	 
}

