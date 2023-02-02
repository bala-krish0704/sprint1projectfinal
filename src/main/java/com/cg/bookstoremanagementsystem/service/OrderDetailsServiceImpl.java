package com.cg.bookstoremanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.bookstoremanagementsystem.entity.OrderDetails;
import com.cg.bookstoremanagementsystem.exception.ResourceNotFoundException;
import com.cg.bookstoremanagementsystem.repository.OrderDetailsRepository;
import com.cg.bookstoremanagementsystem.repository.OrderRepository;



@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService {
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public OrderDetails orderDetails(String orderId, OrderDetails orderDetails) throws ResourceNotFoundException {
		return orderRepository.findById(orderId).map(order -> {
			orderDetails.setOrder(order);
			return orderDetailsRepository.save(orderDetails);
		}).orElseThrow(() -> new ResourceNotFoundException("order not found"));
	}

	@Override
	public List<OrderDetails> getAllOrderDetailsByOrderId(String orderId) {
		return orderDetailsRepository.findByOrder_OrderId(orderId);
	}

	@Override
	public ResponseEntity<?> deleteImage(String orderId) throws ResourceNotFoundException {
		List<OrderDetails> orderDetails = orderDetailsRepository.findByOrder_OrderId(orderId);
		for (OrderDetails oD : orderDetails){
			orderDetailsRepository.delete(oD);
		}
		return ResponseEntity.ok().build();
	}

	@Override
	public List<OrderDetails> getOrderDetailsBySellerId(Long sellerId) {
		return orderDetailsRepository.findBySellerId(sellerId);
	}

	public ResponseEntity<OrderDetails> updateSeller(Long orderDetailsId, OrderDetails orderDetails)
			throws ResourceNotFoundException {
		 OrderDetails newOrderDetails = orderDetailsRepository.findById(orderDetailsId)
			        .orElseThrow(() -> new ResourceNotFoundException("Seller not found for this id :: " + orderDetailsId));
			        
			        final OrderDetails updatedOrderDetails = orderDetailsRepository.save(newOrderDetails);
			        return ResponseEntity.ok(updatedOrderDetails);
	}

	@Override
	public List<OrderDetails> getOrderDetailsByBookId(Long bookId) {
		// TODO Auto-generated method stub
		return null;
	}


	}

