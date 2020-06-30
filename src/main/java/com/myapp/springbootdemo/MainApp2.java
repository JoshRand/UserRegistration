package com.myapp.springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dao.UserDaoImpl;
import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Languages;
import com.model.User;
import com.service.UserService;



@Controller
@RequestMapping("/app")
public class MainApp2
{

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
}
