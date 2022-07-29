package com.practice.springbootsearchrestapidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springbootsearchrestapidemo.entity.Product;
import com.practice.springbootsearchrestapidemo.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {


	@Autowired
	public ProductService productService;

	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
		return ResponseEntity.ok(productService.searchProducts(query));
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product p) {
		return productService.create(p);
	}
	@GetMapping
	public List<Product> getProducts() {
		return productService.findAll();
	}

}
