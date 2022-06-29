package com.Ecommerce.W_Buy.W_Buy.Model;
import java.io.Serializable;
import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.validation.constraints.Size;



@Entity
@Table(name = "Products")
public class Product implements Serializable {
	 private static final long serialVersionUID = -1000119078147252957L;

	   
	    
	 
	    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return name;
	}

	public void setProductName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return fileName;
	}

	public void setImage(String fileName) {
		this.fileName = fileName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(unique = true)
	    private String name;

	    private BigDecimal price;

	    @Size(min = 10, max = 500)
	    private String description;

	    private String fileName;
	    
	    private  int quantity;

	    @ManyToOne
	    private Category category;

	 

	
	    
	   

	   
	 

	   



}
