package io.practice.searchdemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import io.practice.searchdemo.entity.Product;
import io.practice.searchdemo.repository.ProductRepository;
import io.practice.searchdemo.service.ProductService;

@Service
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
	@Override
	public Page<Product> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
		// TODO Auto-generated method stub
		return productRepository.findAll(PageRequest.of(pageParam.orElse(0),
				5,Direction.ASC,sortBy.orElse("id")));

	}


}
