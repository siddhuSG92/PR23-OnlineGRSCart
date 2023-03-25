package com.grsTech.grsCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grsTech.grsCart.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
