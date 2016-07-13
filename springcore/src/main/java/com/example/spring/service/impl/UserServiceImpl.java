package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring.domain.User;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;

@Component
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepositoryImpl userRepository;
	
	
	@Override
	public List<User> list() {
		//call method from UserRepository and remove throw
		userRepository.list();
		return null;
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		userRepository.get(id);
		return null;
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		System.out.println("First impl");
		userRepository.save(user);
	}
}
