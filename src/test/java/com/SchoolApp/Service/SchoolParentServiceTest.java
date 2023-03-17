package com.SchoolApp.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.SchoolApp.Entity.Parent;
import com.SchoolApp.Repository.ParentRepo;
import com.SchoolApp.Services.JwtService;
import com.SchoolApp.Services.ParentService;

@SpringBootTest
public class SchoolParentServiceTest {

	@Mock
	private ParentRepo parentRepo;

	@Mock
	AuthenticationManager authenticationManager;

	private ParentService parentService;

	@Test
	void addUser_ValidTest() {
		
		 JwtService jwtService = new JwtService();
		 Parent expectedParent=Parent.builder()
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
	}
}
