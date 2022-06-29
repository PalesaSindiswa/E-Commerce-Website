package com.Ecommerce.W_Buy.W_Buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.W_Buy.W_Buy.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	   Category findCategoryById(Long id);
	    Category findCategoryByName(String name);
	    boolean existsByName(String name);

}
