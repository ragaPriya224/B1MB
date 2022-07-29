package io.practice.searchdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.practice.searchdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	@Query("SELECT p FROM Product p WHERE "+
	"p.name LIKE CONCAT('%',:query,'%')")
	List<Product> searchProducts(String query);
	
	@Query(value = "SELECT * FROM productsdemo p  WHERE "+
	"p.name LIKE CONCAT('%',:query,'%')", nativeQuery = true)
	List<Product> searchProductsNativeSql(String query);
	
}
