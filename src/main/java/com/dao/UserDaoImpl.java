package com.dao;
import java.sql.*;
import java.util.ArrayList;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;
import com.usercrud.UserRepo;
@Component
public class UserDaoImpl implements UserDao
{
	@Autowired
	private UserRepo userRepo;
	
	public User findById(int id)
	{
		Optional<User> optstu = userRepo.findById(id);
		return optstu.isPresent() ? optstu.get() : null;
	}
	@Override
	public void addUser(User stu)
	{
		// TODO Auto-generated method stub
		System.out.println(stu.toString());
		
		userRepo.save(stu);
		
	}
	@Override
	public List<User> findAll()
	{
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		userRepo.findAll().iterator().forEachRemaining(list::add);
		
		return list;
	}
	@Override
	public User findUser(String name)
	{
		// TODO Auto-generated method stub
		return userRepo.findByUserName(name);
	}
	@Override
	public User updateUser(User user)
	{
		// TODO Auto-generated method stub
		//User stu = findById(user.getuId());
		//userRepo.save(stu);
		return user;
		//or stu not sure which one
	}


}
