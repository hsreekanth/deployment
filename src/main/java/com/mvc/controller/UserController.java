package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mvc.model.User;

@Controller
public class UserController {

	@GetMapping(value = {"/","/home"} )
	public String homepage() {
		
	 //User us=new User();
		
		return "home";
	}
	
	@GetMapping(value = "/registration" )
	public String registration(@ModelAttribute User user,Model model) {
		
		System.out.println(user);
		
		
		return "home";
	}
}
