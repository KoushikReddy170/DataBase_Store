package com.koushik.demo.pckg;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koushik.demo.model.User;

public interface UserRepo extends JpaRepository<User, String> 
{
	
}
