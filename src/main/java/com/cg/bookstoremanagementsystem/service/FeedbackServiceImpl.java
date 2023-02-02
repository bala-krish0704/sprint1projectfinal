package com.cg.bookstoremanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstoremanagementsystem.entity.Feedback;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.bookstoremanagementsystem.repository.FeedbackRepository;


@Service //which marks this class as service class
public class FeedbackServiceImpl implements IFeedbackService{
	@Autowired
	private FeedbackRepository feedbackRepo;

	@Override
	public Feedback addFeedback(Feedback feed) {
		return feedbackRepo.save(feed);
		
	}
	
	@Override
	public List<Feedback> listAllFeedbacks() {
		return feedbackRepo.findAll();
	}

	@Override
	public Feedback getFeedBackById(Long fedId) throws ResourceNotFoundException{
		return feedbackRepo.findById(fedId) 
				.orElseThrow(() -> new ResourceNotFoundException("feedback Not found"));
	}
	
	@Override
	public Feedback updateFeedBack(Feedback feed, Long fedId) throws ResourceNotFoundException{
		Feedback existingFeedback = feedbackRepo.findById(fedId)
		         .orElseThrow(() -> new ResourceNotFoundException("Feedback Not found"));
	
		existingFeedback.setFeedBackReaderId(feed.getFeedBackReaderId());
		existingFeedback.setFeedBackOrderId(feed.getFeedBackOrderId());
		existingFeedback.setFeedBackRatingDetails(feed.getFeedBackRatingDetails());
		existingFeedback.setFeedBackDescription(feed.getFeedBackDescription());
		feedbackRepo.save(existingFeedback);
		return existingFeedback;
	}
	
	@Override
	public void deleteFeedBack(Long fedId)  {
		feedbackRepo.deleteById(fedId);		
	}

	@Override
	public List<Feedback> findByFeedBackReaderId(Long fedReaderId) {
		return feedbackRepo.findByFeedBackReaderId(fedReaderId);
	}

	@Override
	public List<Feedback> findByFeedBackOrderId(Long fedOrderId) {
		return feedbackRepo.findByFeedBackOrderId(fedOrderId);
	}

	@Override
	public List<Feedback> findByFeedBackRatingDetails(String fedRatingDetails) {
		return feedbackRepo.findByFeedBackRatingDetails(fedRatingDetails);
	}

	@Override
	public List<Feedback> findByFeedBackDescription(String fedDescription) {
		return feedbackRepo.findByFeedBackDescription(fedDescription);
	}

	@Override
	public Feedback getFeedBackByBookId(Long fedBookId) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	
	


