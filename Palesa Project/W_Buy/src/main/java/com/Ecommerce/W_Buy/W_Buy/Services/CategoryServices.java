package com.Ecommerce.W_Buy.W_Buy.Services;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.W_Buy.W_Buy.Model.Category;
import com.Ecommerce.W_Buy.W_Buy.Model.Product;
import com.Ecommerce.W_Buy.W_Buy.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServices {
	
	@Autowired
	 private  CategoryRepository categoryRepository ;

	    public void save(Category category){
	        categoryRepository.save(category);
	    }
	    public List<Category> findAll(){
	        return categoryRepository.findAll();
	    }
	    public Category findCategoryByName(String productObject){
	        return categoryRepository.findCategoryByName(productObject);
	    }
	    public Category findCategoryById(Long id){
	        return categoryRepository.findCategoryById(id);
	    }
	    public List<Category> getAllCategories(){
	        return categoryRepository.findAll();
	    }

	    public Boolean existsByName(String name) {
	        return categoryRepository.existsByName(name);
	    }
	    public void removeCategory(Category category){
	        categoryRepository.delete(category);
	    }
	
}
