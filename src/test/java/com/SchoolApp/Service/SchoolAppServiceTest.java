package com.SchoolApp.Service;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Entity.Staff;
import com.SchoolApp.Repository.ParentRepo;
import com.SchoolApp.Repository.StaffRepo;
import com.SchoolApp.Services.ParentService;
import com.SchoolApp.Services.StaffService;

@SpringBootTest
public class SchoolAppServiceTest {

	@Autowired
	private ParentService parentService;

	@Autowired
	private StaffService staffService;

	@MockBean
	private ParentRepo parentRepo;

	@MockBean
	private StaffRepo staffRepo;

	@Test
	public void testAddParent() {
		Parent parent = new Parent();
		parent.setStudent_Register_Number("R001");
		parent.setParent_Name("aaa");
		parent.setStudent_Name("bbb");
		parent.setAddress("ccc");
		parent.setCity("ddd");
		parent.setCountry("sddd");
		parent.setEmail_Address("a@b.gmail.com");
		parent.setPrimary_Contact_Person_Mobile_No("9874561238");
		parent.setPrimary_Contact_Person_Name("sdfdf");
		parent.setSecondary_Contact_Person_Mobile_No("9874561237");
		parent.setSecondary_Contact_Person_Name("ddfff");
		parent.setState("cczczcz");
		parent.setZip_Code(9875);

		Mockito.when(parentRepo.save(parent)).thenReturn(parent);

		assertThat(parentService.saveParentDetail(parent)).isEqualTo(parent);
	}

	@Test
	public void testGetAllParents() {
		Parent parent = new Parent();
		parent.setStudent_Register_Number("R001");
		parent.setParent_Name("aaa");
		parent.setStudent_Name("bbb");
		parent.setAddress("ccc");
		parent.setCity("ddd");
		parent.setCountry("sddd");
		parent.setEmail_Address("a@b.gmail.com");
		parent.setPrimary_Contact_Person_Mobile_No("9874561238");
		parent.setPrimary_Contact_Person_Name("sdfdf");
		parent.setSecondary_Contact_Person_Mobile_No("9874561237");
		parent.setSecondary_Contact_Person_Name("ddfff");
		parent.setState("cczczcz");
		parent.setZip_Code(9875);
		
		
		Parent parent1=new Parent();
		parent1.setStudent_Register_Number("R001");
		parent1.setParent_Name("aaa");
		parent1.setStudent_Name("bbb");
		parent1.setAddress("ccc");
		parent1.setCity("ddd");
		parent1.setCountry("sddd");
		parent1.setEmail_Address("a@b.gmail.com");
		parent1.setPrimary_Contact_Person_Mobile_No("9874561238");
		parent1.setPrimary_Contact_Person_Name("sdfdf");
		parent1.setSecondary_Contact_Person_Mobile_No("9874561237");
		parent1.setSecondary_Contact_Person_Name("ddfff");
		parent1.setState("cczczcz");
		parent1.setZip_Code(9875);

		List<Parent>parentList=new ArrayList<>();
		parentList.add(parent);
		parentList.add(parent1);
		
		Mockito.when(parentRepo.findAll()).thenReturn(parentList);
		
		assertThat(parentService.getParentDetails()).isEqualTo(parentList);
		
	}

	@Test
	public void testAddStaffCircular() {
		Staff staff = new Staff();
		staff.setNotification_Posted_By("ffdgfhgf");
		staff.setInformation_Text("gcgh");

		Mockito.when(staffRepo.save(staff)).thenReturn(staff);

		assertThat(staffService.createCircular(staff)).isEqualTo(staff);

	}
	
	@Test
	public void testgetAllCircular()
	{
		Staff staff = new Staff();
		staff.setNotification_Posted_By("ffdgfhgf");
		staff.setInformation_Text("gcgh");

		Staff staff1 = new Staff();
		staff1.setNotification_Posted_By("ffdgfhgf");
		staff1.setInformation_Text("gcgh");
		
		List<Staff>staffList=new ArrayList<>();
		staffList.add(staff);
		staffList.add(staff1);
		
		Mockito.when(staffRepo.findAll()).thenReturn(staffList);
		
		assertThat(staffService.getAllCircular()).isEqualTo(staffList);
		

	}
	
}
