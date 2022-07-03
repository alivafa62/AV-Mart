package com.av.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.av.mart.model.User;

@Repository
	public interface UserRepository extends JpaRepository<User, Long> {
	  User findByEmail(String email);
	}


