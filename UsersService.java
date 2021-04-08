package com.tera.codingtest.service;

import java.util.List;

import com.tera.codingtest.model.Users;

public interface UsersService {
	
	public List<Users> findAll();
	public Users findbyId(int theId);
	public void register(Users theUsers);
	}
