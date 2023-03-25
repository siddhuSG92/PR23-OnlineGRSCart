package com.grsTech.grsCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grsTech.grsCart.entity.Category;
import com.grsTech.grsCart.service.CategoryServcieInterface;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryServcieInterface categoryServcieInterface ;
	
	@PostMapping("/addCategory")
	public List<Category> addCategoryList(@RequestBody List<Category> categoryList) {
		List<Category> categoryResponse = categoryServcieInterface.addCategoryList(categoryList) ;
		return categoryResponse ;
	}
	
	@GetMapping("/fetchAllCategory")
	public List<Category> fetchAllCategory() {
		List<Category> categoryResponseList = categoryServcieInterface.getAllCategory() ;
		return categoryResponseList ;
	}

}
