package com.cg.bookstoremanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstoremanagementsystem.entity.Admin;
import com.cg.bookstoremanagementsystem.service.AdminService;



@RestController
@RequestMapping("/api/v1")
public class AdminController {
	@Autowired
	private AdminService service;
	
	
	@PostMapping
	public String saveAdmin(@RequestBody Admin admin) {
		Optional<Admin> _admin = service.create(admin);
		if(_admin.isPresent()) {
			return "The admin already exist";
		}else {
			return "Admin data entered successfully";
		}
		
	}
	@GetMapping
	public List<Admin> getAllAdmin(){
		return service.retrieve();
	}
	@GetMapping("/{admin_id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("admin_id") long adminId){
		Optional<Admin> _admin = service.retrieveOne(adminId);
		if(_admin.isPresent()) {
			return new ResponseEntity(_admin.get(), HttpStatus.OK);
		}else {
			return new ResponseEntity( HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping
	public String updateAdmin(@RequestBody Admin admin) {
		Optional<Admin> _admin = service.update(admin);
		if(_admin.isEmpty()) {
			return "The admin data not exist";
		}
			else {
				return "Data updated successfully";
			}

	}
	@DeleteMapping("{/admin_id}")
	public String deleteEmployeeById(@PathVariable("admin_id") Long adminId) {
		return service.delete(adminId);
	}
	

}
