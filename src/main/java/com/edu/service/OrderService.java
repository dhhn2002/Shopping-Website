package com.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {
	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);
	
}
