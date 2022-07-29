package com.practice.springbootsearchrestapidemo.service;

import java.util.List;

import com.practice.springbootsearchrestapidemo.entity.Product;

public interface ProductService {
	
	List<Product> searchProducts(String query);

	Product create(Product p);

	List<Product> findAll();

}
