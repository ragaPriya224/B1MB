package io.practice.searchdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import io.practice.searchdemo.entity.Product;

public interface ProductService {
	
	List<Product> searchProducts(String query);

	void create(Product p);

	List<Product> getProducts();

	Page<Product> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy);

}
