package com.tera.codingtest.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.cj.xdevapi.Session;
import com.tera.codingtest.model.Users;

public class UsersDaoHibernateImpl implements UsersDao {
	
	
	private EntityManager entitymanager;
	
	@Autowired
	public UsersDaoHibernateImpl(EntityManager theEntityManager){
		entitymanager = theEntityManager;
		
		
	}

	public List<Users> findAll() {
		// TODO Auto-generated method stub
		
		Session currentSession = entitymanager.unwrap(Session.class);
		
		Query<Users> theQuery = currentSession.createQuery("from Users", Users.class);
		
		List<Users> users = theQuery.getResultList();
		
		return users;

	}

	public Users findbyId(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		
		Users theUsers = currentSession.get(Employee.class,theId);
		
		return theUsers;
		
	}

	public void register(Users theUsers) {
		
		Session currentSession = entitymanager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theUsers);
		// TODO Auto-generated method stub

	}

}
