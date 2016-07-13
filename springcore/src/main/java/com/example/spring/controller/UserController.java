package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;

public class UserController 
{
	@Autowired
	private UserService userservice;
	
	public void createUser(User user)
	{
		userservice.save(user);
	}
}
