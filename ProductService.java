package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService 
{
	List<Product> findAll();
	
	Product findById(int id);
	
	Product findByName(String name);
	int deleteById(int id);
	
	Product save(Product pt);

}
