package com.edu.service;

import java.util.List;
import java.util.Optional;

import com.edu.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(Optional<String> cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);


}
