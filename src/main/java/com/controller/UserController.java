package com.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Languages;
import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/userRegistration")
public class UserController
{
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("dept")
	public List<Department> populateList()
	{
		return userService.getAllDepartments();
	}
	@ModelAttribute("city")
	public List<City> populateList1()
	{
		return userService.getAllCities();
	}
	@ModelAttribute("country")
	public List<Country> populateList2()
	{
		return userService.getAllCountries();
	}
	@ModelAttribute("lang")
	public List<Languages> populateLan()
	{
		return userService.getLanguage();
	}
	@ModelAttribute("hobs")
	public List<Hobbies> populateHobbies()
	{
		return userService.getHobbies();
	}
	@GetMapping
	public String showRegistration(ModelMap model)
	{
		User user = new User();
		model.addAttribute("user",user);
		
		return "userForm";
	}
	@PostMapping
	public String addUser(User user ,BindingResult result, ModelMap model)
	{
		if(result.hasErrors())
			return "userForm";
		
		user.setLanguageList(user.getLanguages().toString());
		user.setHobbiesList(user.getHobbies().toString());
		model.put("user",user);
		
		userService.addUser(user);
		return "userSuccess";
	}
	@GetMapping("/viewusers")
	public String showAllUsers(ModelMap model)
	{
		List list = new ArrayList<User>();
		list = userService.findAllUsers();
		model.put("list",list);
		System.out.println(model.get("list").toString());
		System.out.println("Size of model "  + model.size());
		return "viewusers";
	}
	
	
}
