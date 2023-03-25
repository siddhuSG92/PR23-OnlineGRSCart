package com.grsTech.grsCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grsTech.grsCart.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {

}
