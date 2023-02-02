package com.cg.bookstoremanagementsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookstoremanagementsystem.entity.OrderDetails;



@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long>{
	
	List<OrderDetails> findByOrder_OrderId(String orderId);
	List<OrderDetails> findBySellerId(Long sellerId);
	Optional<OrderDetails> findByOrderDetailsIdAndOrder_OrderId(Long orderDetailsId, String orderId);

}
