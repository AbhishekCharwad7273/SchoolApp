package com.SchoolApp.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Entity.User;
import com.SchoolApp.Services.ParentService;
import com.SchoolApp.Services.StaffService;
import com.SchoolApp.Services.UserService;



@RestController
public class UserController {


	
	@Autowired
	private UserService userService;
	
	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user)
	{
		return userService.registerNewUser(user); 
	}
	
	@PostConstruct
	public void initRolesAndUser()
	{
		userService.initRolesAndUser();
	}
	

	
}
