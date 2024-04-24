package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;
@RestController
public class CategoryController 
{
	@Autowired
	private CategoryService cs;
	
	@GetMapping(value="/")
	public List<Category>m1()
	{
		return cs.findAll();
	}
	@GetMapping(value="/findbyid/{id}")
	public Category m2(@PathVariable int id) 
	{
		return cs.findById(id);
	}
	@GetMapping(value="/findbyname/{a}")
	public Category m3(@PathVariable String a) 
	{
		return cs.findByName(a);
	}
	@DeleteMapping(value="/deletebyid/{a}")
	public int m4(@PathVariable int a) 
	{
		
		return cs.deleteById(a);
	}
	@PostMapping(value="/save")
	public  Category m5(@RequestBody Category ct) 
	{
		return cs.save(ct);
	}
	@PutMapping(value="/update")
	public Category m6(@RequestBody Category ct)
	{
		return cs.save(ct);
	}
}
