package com.Ecommerce.W_Buy.W_Buy.Dto;

import javax.validation.constraints.NotNull;

public class AddToCart {
	 private Integer id;
	    private @NotNull Integer productId;
	    private @NotNull Integer quantity;

	    public AddToCart() {
	    }



	    @Override
	    public String toString() {
	        return "CartDto{" +
	                "id=" + id +
	                ", productId=" + productId +
	                ", quantity=" + quantity +
	                ",";
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }


	    public Integer getProductId() {
	        return productId;
	    }

	    public void setProductId(Integer productId) {
	        this.productId = productId;
	    }

	    public Integer getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Integer quantity) {
	        this.quantity = quantity;
	    }

}
