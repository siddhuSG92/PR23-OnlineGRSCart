package com.grsTech.grsCart.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DTLS")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID", nullable = false)
	private String customerId;

	@Column(name = "CUSTOMER_NAME", nullable = false)
	private String customerName;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "MOBILE_NO", nullable = false)
	private String mobileNumber;

	@Column(name = "ALT_MOBILE_NO")
	private String alterMobileNumber;

	@Column(name = "ADDRESS", nullable = false)
	private String address;

	@Column(name = "SEX", nullable = false)
	private String sex;

	@Column(name = "STATUS", nullable = false)
	private String status;

	@Column(name = "CR_DATE", nullable = false)
	private Date createdDate;

	@Column(name = "CR_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPD_DATE")
	private Date updatedDate;

	@Column(name = "UPD_BY")
	private String updatedBy;

	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlterMobileNumber() {
		return alterMobileNumber;
	}

	public void setAlterMobileNumber(String alterMobileNumber) {
		this.alterMobileNumber = alterMobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", alterMobileNumber=" + alterMobileNumber + ", address=" + address
				+ ", sex=" + sex + ", status=" + status + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", products=" + products + "]";
	}
}
