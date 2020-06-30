package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Languages;
import com.model.User;
@Service
@Component
public class UserServiceImpl implements UserService
{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void addUser(User user)
	{
		System.out.println(user.toString());
		userDao.addUser(user);
	}
	@Override
	public List<Department> getAllDepartments()
	{
		List deptList = new ArrayList();
		deptList.add(new Department(1, "IT"));
		deptList.add(new Department(2, "Finance"));
		deptList.add(new Department(3,"Security"));
		
		
		// TODO Auto-generated method stub
		return deptList;
	}
	@Override
	public List<City> getAllCities()
	{
		List cityList = new ArrayList();
		cityList.add(new City(1,"Dallas"));
		cityList.add(new City(2,"Austin"));
		cityList.add(new City(3,"San Jacinto"));
		
		
		// TODO Auto-generated method stub
		return cityList;
	}
	@Override
	public List<Country> getAllCountries()
	{
		List countryList = new ArrayList();
		countryList.add(new Country( 1, "United States"));
		countryList.add(new Country(2, "France" ));
		countryList.add(new Country(3, "Sigma"));
		
		
		// TODO Auto-generated method stub
		return countryList;
	}
	@Override
	public List<Languages> getLanguage()
	{
		List<Languages> lan = new ArrayList<Languages>();
		lan.add(new Languages("english","english"));
		lan.add(new Languages("french","french"));
		lan.add(new Languages("spanish","spanish"));
		// TODO Auto-generated method stub
		return lan;
	}
	@Override
	public List<Hobbies> getHobbies()
	{
		List<Hobbies> hobs = new ArrayList<Hobbies>();
		hobs.add(new Hobbies("Biking","Biking"));
		hobs.add(new Hobbies("Eating","Eating"));
		hobs.add(new Hobbies("Welding","Welding"));
		return hobs;
	}
	@Override
	public List<User> findAllUsers()
	{
		// TODO Auto-generated method stub
		
		return userDao.findAll();
	}

}
