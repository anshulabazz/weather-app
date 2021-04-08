package com.tera.codingtest.service;

import java.util.List;

import com.tera.codingtest.model.Users;

public interface UsersDao {
	
	public List<Users> findAll();
	public Users findbyId(int theId);
	public void register(Users theUsers);
}
