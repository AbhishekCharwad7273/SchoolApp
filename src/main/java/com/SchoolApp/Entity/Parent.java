package com.SchoolApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Parent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long registration_ID;
	private String student_Register_Number;
	private String parent_Name;
	private String student_Name;
	private String address;
	private String state;
	private String country;
	private String city;
	private int zip_Code;
	private String email_Address;
	private String primary_Contact_Person_Name;
	private String primary_Contact_Person_Mobile_No;
	private String secondary_Contact_Person_Name;
	private String secondary_Contact_Person_Mobile_No;
	
	

}
