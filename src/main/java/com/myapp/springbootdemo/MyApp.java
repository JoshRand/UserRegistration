package com.myapp.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/welcome")
public class MyApp
{
	@GetMapping("/greetings")
	public String welcome()
	{
		return "Welcome to spring boot!";
	}
}
