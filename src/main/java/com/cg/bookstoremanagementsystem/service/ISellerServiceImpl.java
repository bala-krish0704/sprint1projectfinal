package com.cg.bookstoremanagementsystem.service;


import org.springframework.http.ResponseEntity;

import com.cg.bookstoremanagementsystem.entity.Seller;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;

import antlr.collections.List;

	public interface ISellerServiceImpl {
		
		public Seller createSeller(Seller seller);
		public List getAllSellers1();
	    public ResponseEntity<Seller> getSellerById(Long sellerId)throws ResourceNotFoundException;
		public ResponseEntity<Seller> getSellerByUsernameAndEmail(String username,String email) throws ResourceNotFoundException;
	    public ResponseEntity<Seller> updateSeller(Long sellerId,Seller sellerDetails) throws ResourceNotFoundException;
		List getAllSeller1();
		java.util.List<Seller> getAllSeller();
		java.util.List<Seller> getAllSellers();
	    
	}


