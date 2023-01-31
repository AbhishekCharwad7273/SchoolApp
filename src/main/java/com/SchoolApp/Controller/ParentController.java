package com.SchoolApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Services.ParentService;



@RestController
public class ParentController {
	
	@Autowired
	private ParentService parentService;
	
	
	@PostMapping("/addParentDetail")
	@PreAuthorize("hasRole('User')")
	public Parent addParentDetail(@RequestBody Parent parent)
	{
		
		return parentService.saveParentDetail(parent);
	}
/*	
	@PostMapping("/addParentDetails")
	public List<Parent> addParentDetails(@RequestBody List<Parent> parent)
	{
		
		return parentService.saveParentDetails(parent);
	}
	*/
	@GetMapping("/getAllParentDetail")
	@PreAuthorize("hasRole('User')")
	public List<Parent>getAllParentDetails()
	{
		return parentService.getParentDetails();
	}
	
	@PutMapping("/updateParentDetail")
	@PreAuthorize("hasRole('User')")
	public Parent updateParentDetail(@RequestBody Parent parent)
	{
		
		return parentService.updateParentDetails(parent);
	}
}
