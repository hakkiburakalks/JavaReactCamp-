package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.CoverLetter;

public interface CoverLetterDao  extends JpaRepository<CoverLetter, Integer>{

	
	CoverLetter getById(int id);
	
	
}
