package com.cg.bookstoremanagementsystem.service;

import java.util.List;

import com.cg.bookstoremanagementsystem.entity.Feedback;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;



public interface IFeedbackService {
	
	public Feedback addFeedback(Feedback feed);
	public List<Feedback> listAllFeedbacks();
	public Feedback getFeedBackById(Long fedId) throws ResourceNotFoundException;
	public Feedback updateFeedBack(Feedback feed,Long fedId) throws ResourceNotFoundException;
	public void deleteFeedBack(Long fedId);
    public Feedback getFeedBackByBookId(Long fedBookId);  
	public List<Feedback> findByFeedBackReaderId(Long fedReaderId) ;
	public List<Feedback> findByFeedBackOrderId(Long fedOrderId) ;
	public List<Feedback> findByFeedBackRatingDetails(String fedRatingDetails);
	public List<Feedback> findByFeedBackDescription(String fedDescription);

}
