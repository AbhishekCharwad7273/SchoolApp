package com.SchoolApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Services.StaffService;




@RestController
public class StaffController {

	
	@Autowired
	private StaffService staffService;
	
	@PostMapping("/createCircular")
	@PreAuthorize("hasRole('Staff')")
	public Staff createCircular(@RequestBody Staff staff)
	{
		
		return staffService.createCircular(staff);
		
	}
	
	@GetMapping("/getAllCircular")
	@PreAuthorize("hasRole('Staff')")
	public List<Staff>getAllCircular()
	{
		return staffService.getAllCircular();
	}
	
	
}
