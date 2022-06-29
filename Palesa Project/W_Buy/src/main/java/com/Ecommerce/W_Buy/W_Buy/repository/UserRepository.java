package com.Ecommerce.W_Buy.W_Buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import com.Ecommerce.W_Buy.W_Buy.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	 Optional<User> findByEmail(String email);
	    Optional<User> findByUsernameOrEmail(String username, String email);
	    Optional<User> findByUsername(String username);
	    
	    List<User> findByIdIn(List<Integer> userIds);
	    
	    Boolean existsByUsername(String username);
	    Boolean existsByEmail(String email);



}
