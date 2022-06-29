package com.Ecommerce.W_Buy.W_Buy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.W_Buy.W_Buy.Enum.RoleName;
import com.Ecommerce.W_Buy.W_Buy.Model.Role;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	  Optional<Role> findByName(RoleName role);



}
