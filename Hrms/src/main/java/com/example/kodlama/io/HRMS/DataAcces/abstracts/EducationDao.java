package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {
	Education getById(int id);

	
	
	
	
}
