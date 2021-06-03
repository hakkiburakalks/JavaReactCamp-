package com.example.kodlama.io.HRMS.Entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name="candidates")
public class Candidates extends User {
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identification_number")
	private String identificationNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;  

}
