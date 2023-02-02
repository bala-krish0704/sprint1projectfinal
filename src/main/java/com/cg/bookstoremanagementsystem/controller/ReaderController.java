package com.cg.bookstoremanagementsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstoremanagementsystem.entity.Reader;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.bookstoremanagementsystem.service.IReaderService;









@CrossOrigin(origins = "http://localhost:4200")
@RestController 
@RequestMapping("/api/v1")
public class ReaderController 
{
	
			@Autowired
			private IReaderService readerService;
			
			
			@GetMapping("/readers")
			public List<Reader> getReaderList()
			{
				return readerService.getReaderList();
			}
			
			@PostMapping("/readers")
			public Reader createReader(@Validated @RequestBody Reader reader)
			{
				return readerService.createReader(reader);
			}

			@GetMapping("/readers/{id}")
		    public ResponseEntity<Reader> getReaderById(@PathVariable(value = "id") Long ReaderId) throws ResourceNotFoundException {
				return readerService.getReaderById(ReaderId);
		    }
			
			@GetMapping("/readers/{username}/{email}")
			public ResponseEntity<Reader> getReaderByUsernameAndEmail(@PathVariable(value = "username") String username,
					@PathVariable(value ="email") String email) throws ResourceNotFoundException {
				return readerService.getReaderByUsernameAndEmail(username, email);
			    }
			
			@PutMapping("/readers/{id}")
		    public ResponseEntity<Reader> updateReader(@PathVariable(value = "id") Long readerId,  @Validated @RequestBody Reader readerDetails) throws ResourceNotFoundException {
				return readerService.updateReader(readerId, readerDetails);
		    }
			
}



