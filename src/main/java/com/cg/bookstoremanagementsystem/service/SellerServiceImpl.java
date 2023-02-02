package com.cg.bookstoremanagementsystem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.bookstoremanagementsystem.entity.Seller;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.bookstoremanagementsystem.repository.SellerRepository;




@Service
public class SellerServiceImpl implements ISellerServiceImpl{
	
	@Autowired
	SellerRepository sellerRepository;

	@Override
	public Seller createSeller(Seller seller) {
		return sellerRepository.save(seller);
	}

	@Override
	public List<Seller> getAllSeller() {
		return sellerRepository.findAll();
	}

	@Override
	public ResponseEntity<Seller> getSellerById(Long sellerId) throws ResourceNotFoundException {
		 Seller seller = sellerRepository.findById(sellerId)
		          .orElseThrow(() -> new ResourceNotFoundException("Seller not found for this id :: " + sellerId));
		        return ResponseEntity.ok().body(seller);
	}

	@Override
	public ResponseEntity<Seller> getSellerByUsernameAndEmail(String username, String email)throws ResourceNotFoundException {
		Seller seller = sellerRepository.findByUsernameAndEmail(username, email)
		          .orElseThrow(() -> new ResourceNotFoundException("Seller not found " ));
		        return ResponseEntity.ok().body(seller);
	}

	@Override
	public ResponseEntity<Seller> updateSeller(Long sellerId, Seller sellerDetails) throws ResourceNotFoundException {
		Seller seller = sellerRepository.findById(sellerId)
			        .orElseThrow(() -> new ResourceNotFoundException("Seller not found for this id :: " + sellerId));

			        seller.setEmail(sellerDetails.getEmail());
			        seller.setLastName(sellerDetails.getLastName());
			        seller.setFirstName(sellerDetails.getFirstName());
			        seller.setUsername(sellerDetails.getUsername());
			        seller.setPassword(sellerDetails.getPassword());
			        seller.setWallet(sellerDetails.getWallet());
			        seller.setGSTIN(sellerDetails.getGSTIN());
			        seller.setMobilenumber(sellerDetails.getMobilenumber());
			        
			        final Seller updatedSeller = sellerRepository.save(seller);
			        return ResponseEntity.ok(updatedSeller);
	}

	@Override
	public List<Seller> getAllSellers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public antlr.collections.List getAllSellers1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public antlr.collections.List getAllSeller1() {
		// TODO Auto-generated method stub
		return null;
	}

}

