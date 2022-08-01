package io.practice.searchdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.practice.searchdemo.entity.Product;
import io.practice.searchdemo.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String searchParam){
		return ResponseEntity.ok(productService.searchProducts(searchParam));	
	}
	@PostMapping
	public void createProduct(@RequestBody Product p ) {
		productService.create(p);
	}
	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	@GetMapping("/page")
	private Page<Product>getProducts(@RequestParam("pageNo") Integer pageParam) {
		return productService.getProductsByPage(pageParam);
	}

}
