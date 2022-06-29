package com.Ecommerce.W_Buy.W_Buy.Services;




import org.springframework.stereotype.Service;

import com.Ecommerce.W_Buy.W_Buy.repository.UserRepository;

@Service


public class UserService  {
	private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
      
}
}