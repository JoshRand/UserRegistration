package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao
{

	User updateUser(User user);

	User findUser(String name);

	List<User> findAll();

	void addUser(User user);
	
	
}
