package com.grsTech.grsCart.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
	
	public String orderRefNumber ;
	public String orderMessage ;
	public String orderPlacedDate ;
	public String getOrderRefNumber() {
		return orderRefNumber;
	}
	public void setOrderRefNumber(String orderRefNumber) {
		this.orderRefNumber = orderRefNumber;
	}
	public String getOrderMessage() {
		return orderMessage;
	}
	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}
	public String getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(String orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
	@Override
	public String toString() {
		return "OrderResponse [orderRefNumber=" + orderRefNumber + ", orderMessage=" + orderMessage
				+ ", orderPlacedDate=" + orderPlacedDate + "]";
	}
}
