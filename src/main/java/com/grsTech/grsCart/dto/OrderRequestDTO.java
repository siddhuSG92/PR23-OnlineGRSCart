package com.grsTech.grsCart.dto;

import com.grsTech.grsCart.entity.Customer;

public class OrderRequestDTO {
	
	public Customer customer ;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequestDTO [customer=" + customer + "]";
	}
}
