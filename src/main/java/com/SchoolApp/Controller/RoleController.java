package com.SchoolApp.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Role;
import com.SchoolApp.Services.RoleService;




@RestController
@CrossOrigin

public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("{createNewRole}")
	public Role	createNewRole(@RequestBody Role role)
	{
		return roleService.createNewRole(role);
		
	}
}
