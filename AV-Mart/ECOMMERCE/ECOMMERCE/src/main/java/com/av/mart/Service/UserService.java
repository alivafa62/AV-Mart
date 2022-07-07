package com.av.mart.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.av.mart.DTO.UserRegistrationDto;
import com.av.mart.model.User;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
