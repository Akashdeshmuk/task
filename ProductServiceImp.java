package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
@Service
@Transactional
public class ProductServiceImp  implements ProductService
{
	@Autowired
	private ProductDao pd;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return pd.findById(id);
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return pd.findByName(name);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return pd.deleteById(id);
	}

	@Override
	public Product save(Product pt) {
		// TODO Auto-generated method stub
		return pd.save(pt);
	}

}
