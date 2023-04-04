package com.grsTech.grsCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grsTech.grsCart.dto.OrderRequestDTO;
import com.grsTech.grsCart.dto.OrderResponse;
import com.grsTech.grsCart.exceptionhandling.BusinessException;
import com.grsTech.grsCart.exceptionhandling.ControllerException;
import com.grsTech.grsCart.service.CustomerServiceInterface;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	CustomerServiceInterface customerServiceInterface ;
	
	@PostMapping("/orderPlace")
	public ResponseEntity<?> orderPlace(@RequestBody OrderRequestDTO orderRequest) {
		
		try {
			System.out.println("Controller : - "+orderRequest);
			OrderResponse orderResponse = customerServiceInterface.orderPlaced(orderRequest) ;
			return new ResponseEntity<OrderResponse>(orderResponse, HttpStatus.CREATED);
		} catch (BusinessException be) {
			ControllerException ce = new ControllerException(be.getErrorCode(), be.getErrorMessage()) ;
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}catch (Exception e) {
			ControllerException ce = new ControllerException("601", "Something Went Wrong") ;
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}		
	}
}
