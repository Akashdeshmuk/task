package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;
@Service
@Transactional
public class CategoryServiceImp implements CategoryService
{
	@Autowired
	private CategoryDao cd;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return cd.findById(id);
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return cd.findByName(name);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return cd.deleteById(id);
	}

	@Override
	public Category save(Category ct) {
		
		return cd.save(ct);
	}

	

	

	

	

	
	

}
