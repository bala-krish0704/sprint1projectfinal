package com.cg.bookstoremanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.bookstoremanagementsystem.entity.Reader;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;





public interface IReaderService {
		
			public List<Reader> getReaderList();
			public Reader createReader(Reader reader);
		    public ResponseEntity<Reader> getReaderById(Long readerId) throws ResourceNotFoundException ;
			public ResponseEntity<Reader> getReaderByUsernameAndEmail(String username, String email) throws ResourceNotFoundException;
		    public ResponseEntity<Reader> updateReader(Long readerId, Reader readerDetails) throws ResourceNotFoundException;
		    
	}
