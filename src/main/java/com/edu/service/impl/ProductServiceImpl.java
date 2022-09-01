package com.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.ProductDAO;
import com.edu.entity.Product;
import com.edu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO pDao;

	@Override
	public List<Product> findAll() {
		return pDao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pDao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(Optional<String> cid) {
		return pDao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return pDao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pDao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pDao.deleteById(id);
	}

		
}
