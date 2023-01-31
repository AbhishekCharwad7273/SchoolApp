package com.SchoolApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Repository.StaffRepo;



@Service
public class StaffService {
	
	@Autowired
	private StaffRepo staffRepo;
	
	public Staff createCircular(Staff staff)
	{
		return staffRepo.save(staff);
	}

	public List<Staff> getAllCircular()
	{
		return staffRepo.findAll();
	}
}
