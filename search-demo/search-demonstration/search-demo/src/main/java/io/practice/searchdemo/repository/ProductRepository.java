package io.practice.searchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.practice.searchdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
