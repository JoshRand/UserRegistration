package com.service;

import java.util.List;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Language;
import com.model.User;

public interface UserService
{
	public List<Department> getAllDepartments();
	public List<Country> getAllCountries();
	public List<Hobbies> getHobbies();
	public List<City> getAllCities();
	public List<Language> getLanguage();
	public List<User> findAllUsers();
	void addUser(User user);
	
}
