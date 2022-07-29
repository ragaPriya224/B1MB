package io.practice.searchdemo.service;

import java.util.List;

import io.practice.searchdemo.entity.Product;

public interface ProductService {
	
	List<Product> searchProducts(String query);

	void create(Product p);

	List<Product> getProducts();

}
