package com.SchoolApp.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Repository.ParentRepo;
import com.SchoolApp.Services.ParentService;

import ch.qos.logback.core.status.Status;

@RestController
@CrossOrigin
public class ParentController {

	Logger logger = LoggerFactory.getLogger(ParentController.class);

	@Autowired
	private ParentService parentService;

	@Autowired
	private ParentRepo parentRepo;

	@PostMapping("/addParentDetail")
	@PreAuthorize("hasRole('User')")
	public Parent addParentDetail(@Valid @RequestBody Parent parent) {
		
		logger.info("This is sample info message");
		logger.warn("This is sample warn message");
		logger.error("This is sample error message");
		logger.debug("This is sample debug message");

		return parentService.saveParentDetail(parent);
	}

	/*
	 * @PostMapping("/addParentDetails") public List<Parent>
	 * addParentDetails(@RequestBody List<Parent> parent) {
	 * 
	 * return parentService.saveParentDetails(parent); }
	 */
	@GetMapping("/getAllParentDetail")
	@PreAuthorize("hasAnyRole('User','Staff')")
	public List<Parent> getAllParentDetails() {
		
		logger.info("This is sample info message");
		logger.warn("This is sample warn message");
		logger.error("This is sample error message");
		logger.debug("This is sample debug message");

		return parentService.getParentDetails();
	}

	@PutMapping("/updateParentDetail")
	@PreAuthorize("hasRole('User')")
	public Parent updateParentDetail(@Valid @RequestBody Parent parent) {

		return parentService.updateParentDetails(parent);
	}

}
