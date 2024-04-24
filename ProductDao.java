package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
import com.demo.model.Product;

@Repository
public interface ProductDao  extends JpaRepository<Product,Integer>
{
	List<Product> findAll();
	
	Product findById(int id);
	
	Product findByName(String name);
	int deleteById(int id);
	
	Product save(Product pt);

}
