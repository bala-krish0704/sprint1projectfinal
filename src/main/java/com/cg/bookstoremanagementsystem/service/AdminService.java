package com.cg.bookstoremanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstoremanagementsystem.entity.Admin;
import com.cg.bookstoremanagementsystem.repository.AdminRepository;



@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminrepo;
	
	public Optional<Admin> create(Admin admin){
		  if (adminrepo.existsById(admin.getAdminId())){
	            return Optional.empty();
	        }else{
	            return Optional.of(adminrepo.save(admin));
	        }
	}
	 public List<Admin> retrieve(){
	        return adminrepo.findAll();
	    }
	 public Optional<Admin> retrieveOne(Long adminId){
	        return adminrepo.findById(adminId);
	    }

public Optional<Admin> update(Admin admin){
    if (adminrepo.existsById(admin.getAdminId())){
        return Optional.of(adminrepo.save(admin));
    }else{
        return Optional.empty();
    }
}
public String delete(Long adminId){
    if (adminrepo.existsById(adminId)){
        adminrepo.deleteById(adminId);
        return adminId + " deleted successfully!";
    }else{
        return "The employee data does not exist in records!";
    }
    
}
}
