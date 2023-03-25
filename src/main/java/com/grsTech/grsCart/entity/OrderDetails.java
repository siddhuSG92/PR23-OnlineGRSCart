package com.grsTech.grsCart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DTLS")
public class OrderDetails {

	  @Id
	  @Column(name = "ORDER_ID", nullable = false)
	  private String orderId ;
	
	  @Column(name = "PRODUCT_ID", nullable = false)
	  private String productId  ;
	 
	  @Column(name = "EMAIL", nullable = false)
	  private String email  ;
	  
	  @Column(name = "ORDER_PLACED_DT", nullable = false)
	  private Date orderPlacedDt ;
	  
	  @Column(name = "ORDER_BY", nullable = false)
	  private String orderBy  ;
	  
	  @Column(name = "CR_DATE", nullable = false)
	  private Date createdDate ;
	  
	  @Column(name = "CR_BY", nullable = false)
	  private String createdBy ;
	  
	  @Column(name = "UPD_DATE")
	  private Date updatedDate ;

	  @Column(name = "UPD_BY")
	  private String updatedBy ;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getOrderPlacedDt() {
		return orderPlacedDt;
	}

	public void setOrderPlacedDt(Date orderPlacedDt) {
		this.orderPlacedDt = orderPlacedDt;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", productId=" + productId + ", email=" + email + ", orderPlacedDt="
				+ orderPlacedDt + ", orderBy=" + orderBy + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + "]";
	}
}
