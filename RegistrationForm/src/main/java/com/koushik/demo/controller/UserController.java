package com.koushik.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koushik.demo.model.User;
import com.koushik.demo.pckg.UserRepo;
import com.koushik.demo.service.UserService;

@Controller
public class UserController 
{
	private UserService userService;

	
	@Autowired
	UserRepo repo;
	
	
	public UserController(UserService userService) 
	{
		super();
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public String listUsers(Model model)
	{
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
	
	@RequestMapping("/")
	public String register()
	{
		return "register.html";
	}
	@RequestMapping("/addTheUser")
	public String addTheUser(User user)
	{
		repo.save(user);
		return "xx.html";
	}
	
	
}
