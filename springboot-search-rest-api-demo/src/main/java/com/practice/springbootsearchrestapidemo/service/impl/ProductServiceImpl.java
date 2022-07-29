package com.practice.springbootsearchrestapidemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springbootsearchrestapidemo.entity.Product;
import com.practice.springbootsearchrestapidemo.repository.ProductRepository;
import com.practice.springbootsearchrestapidemo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> searchProducts(String query) {
		List<Product> output = productRepository.searchProducts(query);
		return output;
	}

	@Override
	public Product create(Product p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
