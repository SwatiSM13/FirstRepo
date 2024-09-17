package com.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.authentication.entities.User;
import com.authentication.services.*;
@Controller
public class UserController {
@Autowired
UserService service;

@PostMapping("/signUp")
public String validateUser(@ModelAttribute User user) {
	boolean status=service.usernameExists(user.getUsername());
	if(status==false) {
		service.addUser(user);
	}
return "login";

}


@PostMapping("/login")
public String validateUser(@RequestParam String username,@RequestParam String password) {
	

	boolean status=service.validateUser(username,password);
	if(status==false)
	return "home";
	
		else {
			return "login";
}
}
}

