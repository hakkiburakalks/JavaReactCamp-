package com.example.kodlama.io.HRMS.Entities.dtos;

import java.util.List;

import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;
import com.example.kodlama.io.HRMS.Entities.concretes.Education;
import com.example.kodlama.io.HRMS.Entities.concretes.Experience;
import com.example.kodlama.io.HRMS.Entities.concretes.Image;
import com.example.kodlama.io.HRMS.Entities.concretes.Language;
import com.example.kodlama.io.HRMS.Entities.concretes.Link;
import com.example.kodlama.io.HRMS.Entities.concretes.Skills;

public class CandidatesFeaturesDtos {

	
	public Candidates candidates;
	public List< Education> educations;
	public List<Skills> resumeSkills;
	public List<Link> resumeLinks;
	public List<Experience> jobExperiences;
	public List<Language> languages;
	public Image image;
	
	
	
	
}
