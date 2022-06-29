package com.Ecommerce.W_Buy.W_Buy.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Ecommerce.W_Buy.W_Buy.Model.Category;
import com.Ecommerce.W_Buy.W_Buy.Model.Product;
import com.Ecommerce.W_Buy.W_Buy.repository.ProductRepository;


import java.util.List;


import javax.transaction.Transactional;


@Service
public class ProductServices {
	 
	  @Autowired
	    private ProductRepository productRepository;
	  private CategoryServices categoryService;
	  
	  
	  @Transactional
      public ResponseEntity<String> save(Product productObject){
		  try {
			  Category category = categoryService.findCategoryByName(productObject.getCategory().getName());
		  Product product = new Product();
	        product.setCategory(category);
	        product.setQuantity(productObject.getQuantity());
	        product.setImage(productObject.getImage());
	        product.setPrice(productObject.getPrice());
	        product.setProductName(productObject.getProductName());
	        
	   productRepository.save(product);
      return ResponseEntity
              .status(HttpStatus.CREATED)
              .body("Order has been created!(" + HttpStatus.CREATED + ")");
  } catch (Exception e) {
      throw new ResponseStatusException(
              HttpStatus.BAD_REQUEST, "This order cannot be created!", e);
  }
	  }
		  public void delete(Product product){
		        productRepository.delete(product);
		    }
		    public List<Product> findAll(){
		        return productRepository.findAll();
		    }
		    public List<Product> findAllByCategoryName(String name){
		        return productRepository.findByCategory_Name(name);
		    }
		    public Product findProductById(Long id){
		        return productRepository.findProductById(id);
		    }
		    public boolean existsByName(String name){
		        return productRepository.existsByName(name);
		    }

		 }
