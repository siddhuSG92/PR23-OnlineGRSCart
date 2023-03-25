package com.grsTech.grsCart.service;

import java.util.List;

import com.grsTech.grsCart.entity.Category;

public interface CategoryServcieInterface {
	
	public List<Category> addCategoryList(List<Category> categoryList) ;
	public List<Category> getAllCategory() ;

}
