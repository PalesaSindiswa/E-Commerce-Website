package com.Ecommerce.W_Buy.W_Buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.W_Buy.W_Buy.Model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

	   Boolean existsByName(String name);
	    Product findProductById(Long id);

	    List<Product> findByCategory_Name(String name);
}