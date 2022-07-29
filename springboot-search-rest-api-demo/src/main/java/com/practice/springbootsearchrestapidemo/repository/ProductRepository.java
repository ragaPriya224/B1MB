package com.practice.springbootsearchrestapidemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.springbootsearchrestapidemo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query("select p from Product p where "+
			"p.name like concat('%', :query,'%')"+
			"OR p.description like concat('%', :query,'%')"
			)
	List<Product> searchProducts(String query);

	@Query(value = "select * from Products p where "+
			"p.name like concat('%', :query,'%')"+
			"OR p.description like concat('%', :query,'%')", nativeQuery = true)
	List<Product> searchProductsSQL(String query);
}
