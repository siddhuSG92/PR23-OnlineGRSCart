package com.grsTech.grsCart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grsTech.grsCart.entity.Category;
import com.grsTech.grsCart.repo.CategoryRepo;
import com.grsTech.grsCart.service.CategoryServcieInterface;

@Service
public class CategoryServcieImpl implements CategoryServcieInterface {
		
	@Autowired
	CategoryRepo categoryRepo ;

	@Override
	public List<Category> addCategoryList(List<Category> categoryList) {
		List<Category> savedCategoryList = categoryRepo.saveAll(categoryList) ;
		return savedCategoryList;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> fetchAllCategory = categoryRepo.findAll() ;
		return fetchAllCategory;
	}
}
