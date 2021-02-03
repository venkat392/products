package com.venkatit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.venkatit.entity.ProductEntity;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductEntity> findAll() {
		ArrayList<ProductEntity> products = new ArrayList<ProductEntity>();  
		//adding products to the List  
		products.add(new ProductEntity(100, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new ProductEntity(101, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new ProductEntity(102, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new ProductEntity(103, "Laptop", "LHP29OCP", 24000.00, 1));  
		products.add(new ProductEntity(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
		products.add(new ProductEntity(105, "Refrigerator ", "12WP9087", 10000.00, 4));  
		//returns a list of product  
		return products;  
	}

}
