package com.grsTech.grsCart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
	
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	  @Id
	  @Column(name = "PRODUCT_ID", nullable = false)
	  private String productId ;
	  
	  @Column(name = "CATEGORY_ID")
	  private String categoryId ;
	
	  @Column(name = "PRODUCT_NAME", nullable = false)
	  private String productName  ;
	 
	  @Column(name = "BRAND", nullable = false)
	  private String brand  ;
	 
	  @Column(name = "PRICE", nullable = false)
	  private Double price  ;
	  
	  @Column(name = "MODEL_NUMBER", nullable = false)
	  private String modelNumber  ;
	  
	  @Column(name = "PRODUCT_STATUS", nullable = false)
	  private String productStatus  ;
	  
	  @Column(name = "CR_DATE", nullable = false)
	  private Date createdDate ;
	  
	  @Column(name = "CR_BY", nullable = false)
	  private String createdBy ;
	  
	  @Column(name = "UPD_DATE")
	  private Date updatedDate ;

	  @Column(name = "UPD_BY")
	  private String updatedBy ;
	  
	  

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
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
		return "Product [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName
				+ ", brand=" + brand + ", price=" + price + ", modelNumber=" + modelNumber + ", productStatus="
				+ productStatus + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", updatedDate="
				+ updatedDate + ", updatedBy=" + updatedBy + "]";
	}
}
