package com.example.kodlama.io.HRMS.Entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<Education> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<Skills> programingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<Link> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<Experience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CoverLetter> coverLetters;	

	@JsonIgnore
	@OneToOne(mappedBy = "candidates")
	private Image image;

}
