package com.tera.codingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tera.codingtest.model.Users;
import com.tera.codingtest.respository.UsersRepository;

@Service
public class UserServiceImpl implements UsersService {
	
	
	private UsersRepository usersRepository;
	
	
	@Autowired
	public UserServiceImpl (UsersRepository theUsersRepository){

	usersRepository = theUsersRepository;
	}
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return usersRepsitory.findALL();
	}

	public void register(Users theUsers) {
		
		return usersRepository.register(theUsers);
		// TODO Auto-generated method stub

	}
	public Users findbyId(int theId) {
		// TODO Auto-generated method stub
		return usersRepository.re
	}
	

}
