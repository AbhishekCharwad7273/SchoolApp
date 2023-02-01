package com.SchoolApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.Entity.AcknowledgedDetails;
import com.SchoolApp.Services.AcknowledgedDetailsService;

@RestController
public class AcknowledgedDetailsController {

	@Autowired
	private AcknowledgedDetailsService acknowledgedDetailsService;

	@PutMapping("/acknowledgeDetails")
	@PreAuthorize("hasRole('User')")
	public ResponseEntity<String> acknowledgeDetails(@RequestBody AcknowledgedDetails details) {
		AcknowledgedDetails updatedDetails = acknowledgedDetailsService.updateDetails(details);
		if (updatedDetails.isAcknowledged()) {
			return new ResponseEntity<>("Details Acknowledged and saved in database.", HttpStatus.OK);
		}
		return new ResponseEntity<>("Cannot Acknowledging Details", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
