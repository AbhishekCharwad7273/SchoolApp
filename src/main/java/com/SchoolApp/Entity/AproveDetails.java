package com.SchoolApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AproveDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long approveRegistration_ID;

	@NotEmpty
	private String student_Register_Number;
	
	private boolean approved=false;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String parent_Name;
	
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z\\s]+$")
	private String student_Name;
	
	@NotEmpty
	private String address;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String state;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String country;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String city;
	
	//@Pattern(regexp = "\\d{6}")
	private int zip_Code;

	@NotEmpty
	@Email
	private String email_Address;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String primary_Contact_Person_Name;
	
	@NotEmpty
	@Pattern(regexp = "\\d{10}", message="Mobile Number Should 10 Digit")
	private String primary_Contact_Person_Mobile_No;
	
	@NotEmpty
	@Pattern(regexp="[a-zA-Z\\s]+", message="Name should contain only alphabets and spaces")
	private String secondary_Contact_Person_Name;
	
	@NotEmpty
	@Pattern(regexp = "\\d{10}", message="Mobile Number Should 10 Digit")
	private String secondary_Contact_Person_Mobile_No;
	
}
