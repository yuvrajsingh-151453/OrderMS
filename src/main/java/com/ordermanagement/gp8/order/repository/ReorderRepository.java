package com.ordermanagement.gp8.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordermanagement.gp8.order.entity.Order;
@Repository
public interface ReorderRepository extends JpaRepository<Order, String>{
	Order findByOrderid(String orderid);
}
