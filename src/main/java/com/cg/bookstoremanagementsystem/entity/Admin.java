package com.cg.bookstoremanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@Column(name = "admin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	
	@Column(name = "admin_emailid")
	private String adminEmailId;
	
	@Column(name = "admin_name")
	private String adminName;
	
	@Column(name = "admin_password")
	private String adminPassword;
	
	@Column(name = "admin_phone")
	private String adminPhone;

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminEmailId() {
		return adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public Admin(long adminId, String adminEmailId, String adminName, String adminPassword, String adminPhone) {
		super();
		this.adminId = adminId;
		this.adminEmailId = adminEmailId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminPhone = adminPhone;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	

}
