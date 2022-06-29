package com.Ecommerce.W_Buy.W_Buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecommerce.W_Buy.W_Buy.Model.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
