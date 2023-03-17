package com.SchoolApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.AproveDetails;
import com.SchoolApp.Services.ApproveDetailsService;

@RestController
@CrossOrigin

public class AproveDetailsController {

	@Autowired
	private ApproveDetailsService approveDetailsService;

	@PutMapping("/approve")
	@PreAuthorize("hasRole('Staff')")
	public ResponseEntity<String> updateDetails(@RequestBody AproveDetails details) {
		AproveDetails updatedDetails = approveDetailsService.updateDetails(details);
		if (updatedDetails.isApproved()) {
			return new ResponseEntity<>("Details Approved and saved in database.", HttpStatus.OK);
		}
		return new ResponseEntity<>("Details Rejected", HttpStatus.BAD_REQUEST);
	}

}
