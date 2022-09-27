package com.koushik.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koushik.demo.model.User;
import com.koushik.demo.pckg.UserRepo;
import com.koushik.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepo userRepository;
	
	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

}
