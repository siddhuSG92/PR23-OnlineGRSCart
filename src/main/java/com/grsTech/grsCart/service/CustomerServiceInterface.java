package com.grsTech.grsCart.service;

import java.util.List;

import com.grsTech.grsCart.dto.OrderRequestDTO;
import com.grsTech.grsCart.dto.OrderResponse;
import com.grsTech.grsCart.entity.Customer;

public interface CustomerServiceInterface {
	
	public OrderResponse orderPlaced(OrderRequestDTO orderRequest);
	public List<OrderRequestDTO> getAllOrderDetails();
	public List<OrderRequestDTO> getOrderByCustomer(String customerId);

}
