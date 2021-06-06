package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.EmployerService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	@Autowired
	private EmployerService employerService;

	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult <List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	@GetMapping("/getByCompanyName")
	public DataResult<Employer> getByCompanyName(String companyName){
		return this.employerService.findByCompanyName(companyName);
	}
	@GetMapping("/getByAllCompanyName")
	public DataResult<List<Employer>> getByAllCompanyName(String companyName){
	    return this.employerService.findByAllCompanyName(companyName);
		
	}
		@GetMapping("/getByWebAdress")
	DataResult<Employer> getByWebAdress(String webAdress){
		return this.employerService.findByWebAdress(webAdress);
	}

	
	@GetMapping("/getByAllWebAdress")
	DataResult<List<Employer>> getByAllWebAdress(String webAdress){
		return this.employerService.findByAllWebAdress(webAdress);
	}
		
}

