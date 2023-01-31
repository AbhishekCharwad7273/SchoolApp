package com.SchoolApp.Services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.Role;
import com.SchoolApp.Entity.User;
import com.SchoolApp.Repository.RoleRepo;
import com.SchoolApp.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RoleRepo roleRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public User registerNewUser(User user) {

		Role role = roleRepo.findById("User").get();

		Set<Role> roles = new HashSet<>();
		roles.add(role);
		user.setRole(roles);
		user.setUserPassword(getEncodedPassword(user.getUserPassword()));
		return userRepo.save(user);
	}

	public void initRolesAndUser() {
		Role staffRole = new Role();
		staffRole.setRoleName("Staff");
		staffRole.setRoleDescription("Staff Role");
		roleRepo.save(staffRole);

		Role userRole = new Role();
		userRole.setRoleName("User");
		userRole.setRoleDescription("Parent Role");
		roleRepo.save(userRole);

		User staffUser = new User();
		staffUser.setUserFirstName("staff");
		staffUser.setUserLastName("staff");
		staffUser.setUserName("staff123");
		staffUser.setUserPassword(getEncodedPassword("staff@123"));

		Set<Role> staffRoles = new HashSet<>();
		staffRoles.add(staffRole);
		staffUser.setRole(staffRoles);
		userRepo.save(staffUser);
		/*
		 * User user = new User(); user.setUserFirstName("abhi");
		 * user.setUserLastName("charwad"); user.setUserName("abhi123");
		 * user.setUserPassword(getEncodedPassword("abhi@123"));
		 * 
		 * Set<Role> userRoles = new HashSet<>(); userRoles.add(userRole);
		 * user.setRole(userRoles); userRepo.save(user);
		 */
	}

	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}
}
