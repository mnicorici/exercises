package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;

@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class UserRepositoryImpl implements UserRepository{
	

	private List<User> list = new ArrayList<>();
	@Override
	public List<User> list() {
		System.out.println("getAll");
		
		return null;
	}

	@Override
	public User get(int id) 
	{
		System.out.println("get " + id);
		return new User();
	}

	@Override
	public void save(User user) {
		list.add(user);
		System.out.println("User saved!!  " + list);
	}

}
