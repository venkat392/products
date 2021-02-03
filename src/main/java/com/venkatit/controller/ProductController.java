package com.venkatit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkatit.entity.ProductEntity;
import com.venkatit.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping(value = "/product",produces = "application/json")  
	public List<ProductEntity> getProduct()   
	{  
		
		System.out.println("hi");
	//finds all the products  
	List<ProductEntity> products = productService.findAll();  
	//returns the product list  
	return products;  
	}  

}
