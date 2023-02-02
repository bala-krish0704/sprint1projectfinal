package com.cg.bookstoremanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.bookstoremanagementsystem.service.*;
import com.cg.bookstoremanagementsystem.entity.Seller;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;

@RestController 
@RequestMapping("/api/sc")
public class SellerController { 
	
	@Autowired
	private ISellerServiceImpl ISellerServiceImpl;

	
	@PostMapping("/seller")
	public Seller createSeller(@Validated @RequestBody Seller seller)
	{
		return ISellerServiceImpl.createSeller(seller);
	}
	
	@GetMapping("/seller")
	public List<Seller> getAllSeller()
	{
		return Seller.getAllSeller();
	}

	//Get seller by id
	@GetMapping("/sellers/{id}")
    public ResponseEntity<Seller> getSellerById(@PathVariable(value = "id") Long sellerId)
        throws ResourceNotFoundException {
		return ISellerServiceImpl.getSellerById(sellerId);
	}
	
	//Get seller by username and email
	@GetMapping("/sellers/{username}/{email}")
	public ResponseEntity<Seller> getSellerByUsernameAndEmail(@PathVariable(value = "username") String username,
			@PathVariable(value = "email") String email) throws ResourceNotFoundException {
		return ISellerServiceImpl.getSellerByUsernameAndEmail(username, email);
		}
	
	//update seller
	@PutMapping("/seller/{id}")
    public ResponseEntity<Seller> updateSeller(@PathVariable(value = "id") Long sellerId,
         @Validated @RequestBody Seller sellerDetails) throws ResourceNotFoundException {
		return ISellerServiceImpl.updateSeller(sellerId, sellerDetails);
    }
	
}


