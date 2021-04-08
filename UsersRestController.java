package com.tera.codingtest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tera.codingtest.model.Users;
import com.tera.codingtest.respository.UsersDao;
import com.tera.codingtest.service.UsersService;

@RestController
@RequestMapping("/api")
public class UsersRestController {
	
	private UsersService usersService;
	
	@Autowired
	public UsersRestController(UsersService theUsersService){
		
		usersService = theUsersService;
		
	}
	
	@GetMapping("/users")
	public List <Users> findAll(){
		return usersService.findAll();
		
		
		
		}
	
	@GetMapping("/users/{usersId}")
	public Users getUser(@PathVariable int usersId){
		
		
		Users theUsers= usersService.findById(usersId);
		
		if(theUsers==null){
			throw new RuntimeException ("users not found");
		}
		return theUsers;
	}
	
	@PostMapping("/users/{usersId}")
	public Users addUser(@RequestBody Users theUsers){
		
		
		theUsers.setId(0);
		usersService.register(theUsers);
		
		return theUsers;
	

	

	}
}
