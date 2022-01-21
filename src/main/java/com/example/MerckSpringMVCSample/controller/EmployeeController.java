package com.example.MerckSpringMVCSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/")
	public String getHomePage(Model model)
	{
		model.addAttribute("successMsg", "Welcome to Spring Boot Heroku Training !!!");
		return "Homepage";
	}

}
