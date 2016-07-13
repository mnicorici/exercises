package com.example.spring.repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.domain.User;


public interface UserRepository {
	
	List<User> list();
	User get(int id);
	void save(User user);
}
