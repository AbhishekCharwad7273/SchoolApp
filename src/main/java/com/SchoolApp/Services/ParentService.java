package com.SchoolApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Repository.ParentRepo;



@Service
public class ParentService {

	@Autowired
	private ParentRepo parentRepo;
	
	public Parent saveParentDetail(Parent parent)
	{
		return parentRepo.save(parent);
	}
/*	
	public List<Parent> saveParentDetails(List<Parent> parent)
	{
		return parentRepo.saveAll(parent);
	}
	
	*/
	public List<Parent> getParentDetails()
	{
		return parentRepo.findAll();
	}
	
	public Parent updateParentDetails(Parent parent)
	{
		Parent existingParentDetails=parentRepo.findById(parent.getRegistration_ID()).orElse(null);
		
		existingParentDetails.setStudent_Register_Number(parent.getStudent_Register_Number());
		existingParentDetails.setStudent_Name(parent.getStudent_Name());
		existingParentDetails.setParent_Name(parent.getParent_Name());
		existingParentDetails.setAddress(parent.getAddress());
		existingParentDetails.setCity(parent.getCity());
		existingParentDetails.setCountry(parent.getCity());
		existingParentDetails.setEmail_Address(parent.getEmail_Address());
		existingParentDetails.setState(parent.getState());
		existingParentDetails.setPrimary_Contact_Person_Mobile_No(parent.getPrimary_Contact_Person_Mobile_No());
		existingParentDetails.setPrimary_Contact_Person_Name(parent.getPrimary_Contact_Person_Name());
		existingParentDetails.setSecondary_Contact_Person_Mobile_No(parent.getSecondary_Contact_Person_Mobile_No());
		existingParentDetails.setSecondary_Contact_Person_Name(parent.getSecondary_Contact_Person_Name());
		existingParentDetails.setZip_Code(parent.getZip_Code());
		
		return parentRepo.save(existingParentDetails);
	}
	
	
}
