package com.SchoolApp.Services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.AproveDetails;
import com.SchoolApp.Repository.AproveDetailsRepo;

@Service
public class ApproveDetailsService {
	
	@Autowired
	private AproveDetailsRepo aproveDetailsRepo;

	
	public AproveDetails updateDetails(AproveDetails aproveDetails)
	{
		
		if(aproveDetails.isApproved())
		{
			return aproveDetailsRepo.save(aproveDetails);
			
		}
		return aproveDetails;
		
	}
}
