package com.grsTech.grsCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grsTech.grsCart.dto.OrderRequestDTO;
import com.grsTech.grsCart.dto.OrderResponse;
import com.grsTech.grsCart.service.CustomerServiceInterface;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	CustomerServiceInterface customerServiceInterface ;
	
	@PostMapping("/orderPlace")
	public OrderResponse orderPlace(@RequestBody OrderRequestDTO orderRequest) {
		System.out.println("Controller : - "+orderRequest);
		OrderResponse orderResponse = customerServiceInterface.orderPlaced(orderRequest) ;
		return orderResponse ;
	}
}
