package com.SchoolApp.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Services.StaffService;




@RestController
@CrossOrigin
public class StaffController {

	Logger logger = LoggerFactory.getLogger(StaffController.class);
	@Autowired
	private StaffService staffService;
	
	@PostMapping("/createCircular")
	@PreAuthorize("hasRole('Staff')")
	public Staff createCircular(@RequestBody Staff staff)
	{
		logger.info("This is sample info message");
		logger.warn("This is sample warn message");
		logger.error("This is sample error message");
		logger.debug("This is sample debug message");
		return staffService.createCircular(staff);
		
	}
	
	@GetMapping("/getAllCircular")
	@PreAuthorize("hasAnyRole('Staff','User')")
	public List<Staff>getAllCircular()
	{
		logger.info("This is sample info message");
		logger.warn("This is sample warn message");
		logger.error("This is sample error message");
		logger.debug("This is sample debug message");
		return staffService.getAllCircular();
	}
	

	
}
