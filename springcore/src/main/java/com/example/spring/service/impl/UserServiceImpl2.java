package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;



@Qualifier
public class UserServiceImpl2 implements UserService, ApplicationContextAware{

	private ApplicationContext applicationContext;
	UserRepository userRepository = applicationContext.getBean(UserRepository.class);
	
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
		System.out.println("In the second implementation");
		userRepository.save(user);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
