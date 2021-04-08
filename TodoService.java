package com.tera.codingtest.service;

import java.nio.file.attribute.UserPrincipal;

import com.tera.codingtest.model.Todo;

public interface TodoService {
	

		Todo completeTodo(Long id, UserPrincipal currentUser);

		Todo unCompleteTodo(Long id, UserPrincipal currentUser);

}
