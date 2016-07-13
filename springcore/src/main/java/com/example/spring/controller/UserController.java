package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;

public class UserController 
{
	@Autowired
	@Qualifier("service2")
	private UserService userservice;
	
	private static int i = 0; 
	
	public void createUser(User user)
	{
		System.out.println(user + " created");
		++i;
		user.setFirstName("User " + i);
		userservice.save(user);
		
		
	}
}
