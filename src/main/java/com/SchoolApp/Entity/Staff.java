package com.SchoolApp.Entity;

import java.time.LocalDate;

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
public class Staff {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staff_ID;
	private LocalDate  notification_Date; 
	private String information_Text;
	private String notification_Posted_By;
	
}
