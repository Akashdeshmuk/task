package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService
{
	List<Category> findAll();
	Category findById(int id);
	Category findByName(String name);
	int deleteById(int id);
	Category save(Category ct);
}
