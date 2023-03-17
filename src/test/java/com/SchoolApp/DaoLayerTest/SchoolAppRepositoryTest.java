package com.SchoolApp.DaoLayerTest;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.SchoolApp.Entity.AcknowledgedDetails;
import com.SchoolApp.Entity.AproveDetails;
import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Repository.AcknowledgedDetailsRepo;
import com.SchoolApp.Repository.AproveDetailsRepo;
import com.SchoolApp.Repository.ParentRepo;
import com.SchoolApp.Repository.StaffRepo;

@SpringBootTest
public class SchoolAppRepositoryTest {

	
	@Autowired
	private ParentRepo parentRepo;
	
	@Autowired
	private StaffRepo staffRepo; 
	
	@Autowired
	private AcknowledgedDetailsRepo acknowledgedDetailsRepo;
	
	@Autowired
	private AproveDetailsRepo aproveDetailsRepo;
	
	@Test
	public void testAddParentRepository()
	{
		
		Parent parent=Parent.builder()
				.student_Register_Number("R001")
				.parent_Name("aaaa")
				.student_Name("dfsdf")
				.address("sdasda")
				.city("sadf")
				.country("sdadsd")
				.email_Address("a@b.gmail.com")
				.primary_Contact_Person_Name("sddsad")
				.primary_Contact_Person_Mobile_No("9874561230")
				.secondary_Contact_Person_Name("dsdsad")
				.secondary_Contact_Person_Mobile_No("9874123654")
				.state("fdfsdf")
				.zip_Code(417845)
				.build();
				
			parentRepo.save(parent);
			
			org.assertj.core.api.Assertions.assertThat(parent.getRegistration_ID()).isGreaterThan(0);
			
	}
	
	@Test
	public void testGetAllParents() {
		List<Parent> parent = parentRepo.findAll();

		org.assertj.core.api.Assertions.assertThat(parent.size()).isGreaterThan(0);

	}
	
	@Test
	public void testUpdateParent()
	{
		Parent parent =parentRepo.findById(1L).get();
		
		parent.setEmail_Address("ab@gmail.com");
		
		Parent updateParent= parentRepo.save(parent);
		
		org.assertj.core.api.Assertions.assertThat(updateParent.getEmail_Address()).isEqualTo("ab@gmail.com");
		
	}
	
	@Test
	public void testCreateCircular()
	{
		
		Staff staff=Staff.builder()
				.information_Text("ssdsd")
				.notification_Posted_By("dsadasd")
				.build();
		
		staffRepo.save(staff);
		
		org.assertj.core.api.Assertions.assertThat(staff.getStaff_ID()).isGreaterThan(0);
	}
	
	@Test
	public void testGetAllCircular()
	{
		List<Staff> staff = staffRepo.findAll();

		org.assertj.core.api.Assertions.assertThat(staff.size()).isGreaterThan(0);

		
	}
	
	@Test
	public void testAcknowdge()
	{
		AcknowledgedDetails ack =acknowledgedDetailsRepo.findById(1L).get();
		
		ack.setInformation_Text("abhishek");
		
		AcknowledgedDetails  updateAck= acknowledgedDetailsRepo.save(ack);
		
		org.assertj.core.api.Assertions.assertThat( updateAck.getInformation_Text()).isEqualTo("abhishek");
		
	}
	
	public void testAcceptReject()
	{
		AproveDetails ad=aproveDetailsRepo.findById(1L).get();
		
		ad.setEmail_Address("ab@gmail.com");
		
		AproveDetails updateAproveDetails=aproveDetailsRepo.save(ad);
		
		org.assertj.core.api.Assertions.assertThat( updateAproveDetails.getEmail_Address()).isEqualTo("ab@gmail.com");
		
	}
}
