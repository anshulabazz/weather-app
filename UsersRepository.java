package com.tera.codingtest.respository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tera.codingtest.model.Users;

public interface UsersRepository extends JpaRepository <Users, Integer> {
	
	

}
