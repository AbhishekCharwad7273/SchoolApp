package com.SchoolApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.AcknowledgedDetails;
import com.SchoolApp.Repository.AcknowledgedDetailsRepo;

@Service
public class AcknowledgedDetailsService {

	@Autowired
	private AcknowledgedDetailsRepo acknowledgedDetailsRepo;

	public AcknowledgedDetails updateDetails(AcknowledgedDetails details) {

		if(details.isAcknowledged())
		{
			return acknowledgedDetailsRepo.save(details);
		}
		
		
		return details;

	}
}
