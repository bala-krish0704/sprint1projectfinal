package com.cg.bookstoremanagementsystem.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookstoremanagementsystem.entity.Seller;



@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{
	Optional<Seller> findByUsernameAndEmail(String username, String email);

}

