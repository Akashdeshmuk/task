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
import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService ps;
	@GetMapping(value="/findallproduct")
	public List<Product> m11()
	{
		return ps.findAll();
	}
	@GetMapping(value="/findproductbyid/{id}")
	public Product m7(@PathVariable int id) 
	{
		return ps.findById(id);
	}
	@GetMapping(value="/findproductbyname/{a}")
	public Product m8(@PathVariable String a) 
	{
		return ps.findByName(a);
	}
	@DeleteMapping(value="/deleteproductbyid/{a}")
	public int m12(@PathVariable int a) 
	{
		
		return ps.deleteById(a);
	}
	@PostMapping(value="/saveproduct")
	public  Product m9(@RequestBody Product pt) 
	{
		return ps.save(pt);
	}
	@PutMapping(value="/updateproduct")
	public Product m10(@RequestBody Product pt)
	{
		return ps.save(pt);
	}

}
