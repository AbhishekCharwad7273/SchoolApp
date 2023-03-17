package com.SchoolApp.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.ForeignKey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcknowledgedDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "ack_ID")
	private Long ack_ID;

	private boolean acknowledged;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "registration_ID")
	//@ForeignKey(name = "registration_ID")
	private Parent parent;

	// @PastOrPresent
	private LocalDate notification_Date;
	
	


	@NotEmpty
	private String information_Text;

	@NotEmpty
	private String notification_Posted_By;
	
	

}
