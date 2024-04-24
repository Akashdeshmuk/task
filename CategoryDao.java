package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
@Repository
public interface CategoryDao  extends JpaRepository<Category,Integer>
{
	List<Category> findAll();
	
	Category findById(int id);
	
	Category findByName(String name);
	int deleteById(int id);
	
	Category save(Category ct);
	
	

}
