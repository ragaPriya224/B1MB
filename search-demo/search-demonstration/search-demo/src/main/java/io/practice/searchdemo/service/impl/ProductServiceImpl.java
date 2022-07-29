package io.practice.searchdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.practice.searchdemo.entity.Product;
import io.practice.searchdemo.repository.ProductRepository;
import io.practice.searchdemo.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public List<Product> searchProducts(String query) {
		// TODO Auto-generated method stub
		List<Product> productsList = productRepository.searchProducts(query);
		return productsList;
	}
	@Override
	public void create(Product p) {
		// TODO Auto-generated method stub
		productRepository.save(p);
	}
	@Override
	public List<Product> getProducts() {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

}
