package com.cg.bookstoremanagementsystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.bookstoremanagementsystem.entity.Reader;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.bookstoremanagementsystem.repository.ReaderRepository;




@Service
public class ReaderServiceImpl  implements IReaderService {

			@Autowired
			private ReaderRepository readerRepository;
			
			@Override
			public List<Reader> getReaderList() {
				return readerRepository.findAll();
			}

			@Override
			public Reader createReader(Reader reader) {
				return readerRepository.save(reader);
			}

			@Override
			public ResponseEntity<Reader> getReaderById(Long ReaderId) throws ResourceNotFoundException {
				Reader reader = readerRepository.findById(ReaderId)
				          .orElseThrow(() -> new ResourceNotFoundException("Reader not found for this id :: " + ReaderId));
				        return ResponseEntity.ok().body(reader);
			}

			@Override
			public ResponseEntity<Reader> getReaderByUsernameAndEmail(String username, String email)throws ResourceNotFoundException {
				 Reader reader = readerRepository.findByUsernameAndEmail(username, email)
				          .orElseThrow(() -> new ResourceNotFoundException("Reader not found "));
				        return ResponseEntity.ok().body(reader);
			}

			@Override
			public ResponseEntity<Reader> updateReader(Long readerId, Reader readerDetails)
					throws ResourceNotFoundException {
				  Reader reader = readerRepository.findById(readerId)
					        .orElseThrow(() -> new ResourceNotFoundException("Reader not found for this id :: " + readerId));

					        reader.setEmail(readerDetails.getEmail());
					        reader.setLastName(readerDetails.getLastName());
					        reader.setFirstName(readerDetails.getFirstName());
					        reader.setBalance(readerDetails.getBalance());
					        reader.setUsername(readerDetails.getUsername());
					        reader.setPassword(readerDetails.getPassword());
					        reader.setNumberOfOrders(readerDetails.getNumberOfOrders());
					        
					        final Reader updatedReader = readerRepository.save(reader);
					        return ResponseEntity.ok(updatedReader);
			}
}






