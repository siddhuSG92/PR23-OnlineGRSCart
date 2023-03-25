package com.grsTech.grsCart.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grsTech.grsCart.dto.OrderRequestDTO;
import com.grsTech.grsCart.dto.OrderResponse;
import com.grsTech.grsCart.entity.Customer;
import com.grsTech.grsCart.entity.OrderDetails;
import com.grsTech.grsCart.entity.Product;
import com.grsTech.grsCart.exceptionhandling.BusinessException;
import com.grsTech.grsCart.repo.CustomerRepo;
import com.grsTech.grsCart.repo.OrderRepo;
import com.grsTech.grsCart.service.CustomerServiceInterface;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {
	
	public static final String customerCode = "GRSC0085" ;
	public static final String orderRefCode = "GCORDR00" ;
	
	@Autowired
	CustomerRepo customerRepo ;
	
	@Autowired
	OrderRepo orderRepo ;

	@Override
	@Transactional
	public OrderResponse orderPlaced(OrderRequestDTO orderRequest) {
		System.out.println("Method orderPlaced(OrderRequestDTO orderRequest) : - +" + orderRequest);
		OrderResponse OrderResponse = new OrderResponse();
		Customer customer = orderRequest.getCustomer();
		customer.setCustomerId(generateCustomerId());

		try {
			if (customer.getCustomerId() != null & customer != null) {

				Customer orderPlacedResponse = customerRepo.save(customer);
				System.out.println("Products Details :- " + orderPlacedResponse.getProducts());
				Product product = (Product) orderPlacedResponse.getProducts().get(0);

				if (orderPlacedResponse != null) {
					OrderDetails OrderDetails = new OrderDetails();
					OrderDetails.setOrderId(generateOrderId());
					OrderDetails.setProductId(product.getProductId());
					OrderDetails.setEmail(orderPlacedResponse.getEmail());
					OrderDetails.setOrderPlacedDt(orderPlacedResponse.getCreatedDate());
					OrderDetails.setOrderBy(orderPlacedResponse.getCreatedBy());
					OrderDetails.setCreatedBy(orderPlacedResponse.getCreatedBy());
					OrderDetails.setCreatedDate(orderPlacedResponse.getCreatedDate());

					orderRepo.save(OrderDetails);
					System.out.println("After Save : = " + orderPlacedResponse);
					// Make Payment here call payment service and generate Payment Ref Number.
					// Once Payment is Success sent confirmation mail to ordered Person with Order Ref Number
					OrderResponse.setOrderMessage("Order Placed Succeffully..!");
					return OrderResponse;
				}

			} else {
				throw new BusinessException("601", "illegal Argument Exception");
			}

		} catch (Exception e) {
			throw new BusinessException("602", e.getMessage());
		}
		return null;
	}

	@Override
	public List<OrderRequestDTO> getAllOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderRequestDTO> getOrderByCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String generateCustomerId() {
		String customerId = null ;
		try {
			Random random = new Random() ;
			int randomNumber = random.nextInt(100);
			customerId = this.customerCode+randomNumber ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerId ;
	}
	
	private String generateOrderId() {
		String orderId = null ;
		try {
			Random random = new Random() ;
			int randomNumber = random.nextInt(100);
			orderId = this.orderRefCode+randomNumber ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return orderId ;
	}


}
