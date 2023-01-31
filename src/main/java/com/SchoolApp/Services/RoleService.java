package com.SchoolApp.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.Role;
import com.SchoolApp.Repository.RoleRepo;


@Service
public class RoleService {

	
	@Autowired
	private RoleRepo roleRepo;
	
	public Role createNewRole(Role role)
	{
		return roleRepo.save(role);
	}
}
