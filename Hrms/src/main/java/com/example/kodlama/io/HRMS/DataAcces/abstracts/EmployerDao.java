package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	
	Employer findByCompanyName(String companyName);
	List<Employer> findAllByCompanyName(String companyName);
	Employer findByWebAdress(String webAdress);
	List<Employer> findAllByWebAdress(String webAdress);
	
	
}
