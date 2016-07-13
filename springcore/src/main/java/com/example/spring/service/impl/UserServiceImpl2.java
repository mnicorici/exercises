package com.example.spring.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;



@Service("service2")
public class UserServiceImpl2 implements UserService, ApplicationContextAware{

	private ApplicationContext applicationContext;
	UserRepository userRepository ;
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

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
		System.out.println("In the second implementation" + user.getFirstName());
		userRepository.save(user);
	}
	
	@PostConstruct
	public void initialize()
	{
		userRepository = applicationContext.getBean(UserRepository.class);
		System.out.println("Beans " + applicationContext.getBeanDefinitionCount());
		System.out.println("Beans " + applicationContext.getBeanDefinitionNames());
		
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
