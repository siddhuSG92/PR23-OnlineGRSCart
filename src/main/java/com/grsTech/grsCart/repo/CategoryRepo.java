package com.grsTech.grsCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grsTech.grsCart.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String> {

}
