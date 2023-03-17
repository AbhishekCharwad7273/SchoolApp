package com.SchoolApp.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staff_ID;
	
	@PastOrPresent
	private LocalDate  notification_Date;
	
	@NotEmpty
	private String information_Text;
	
	@NotEmpty
	private String notification_Posted_By;
	
	private boolean acknowledged;
	
}
