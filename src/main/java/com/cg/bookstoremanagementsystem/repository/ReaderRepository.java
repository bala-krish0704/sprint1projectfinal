package com.cg.bookstoremanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookstoremanagementsystem.entity.Reader;

;



@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {

				
				Optional<Reader> findByUsernameAndEmail(String username, String email);
				
	}



