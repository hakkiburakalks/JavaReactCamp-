package com.example.kodlama.io.HRMS.api.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.CandidatesService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidate")

public class CandidatesController {


	private CandidatesService candidateService;

	public CandidatesController(CandidatesService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidates>> getAll(){
		return this.candidateService.getAll();
	}
	
	@GetMapping("/getByAllMail")
	public DataResult<List<Candidates>> getByAllEmail(String email) {
		
		return this.candidateService.findByAllEmail(email);
	}
	@GetMapping("/getByEmail")
	public DataResult<Candidates> getByEmail(String email) {
		return this.candidateService.findByEmail(email);
	}
	@GetMapping("/getByIdentificationNumber")
	public DataResult<Candidates> getByIdentificationNumber(String identificationNumber) {
		return this.candidateService.findByIdentificationNumber(identificationNumber);
	}
	@GetMapping("/getByAllIdentificationNumber")
	public DataResult<List<Candidates>> getByAllIdentificationNumber(String identificationNumber){
		return this.candidateService.findByAllIdentificationNumber(identificationNumber);
	}
	@GetMapping("/getByAllFirstName")
	DataResult<List<Candidates>> getByAllFirstName(String firstName){
		return this.candidateService.findByAllFirstName(firstName);
	}
	@GetMapping("/getByFirstNameAndIdentificationNumber")
	DataResult<List<Candidates>> getByFirstNameAndIdentificationNumber(String firstName,String identificationNumber){
		return this.candidateService.findByFirstNameAndIdentificationNumber(firstName, identificationNumber);
	}
	@GetMapping("/getByAllLastName")
	DataResult<List<Candidates>> getByAllLastName(String lastName){
		return this.candidateService.findByAllLastName(lastName);
	}
	@GetMapping("/getByLastNameAndIdentificationNumber")
	DataResult<List<Candidates>> getByLastNameAndIdentificationNumber(String lastName,String identificationNumber){
		return this.candidateService.findByLastNameAndIdentificationNumber(lastName, identificationNumber);
	}
	
	@GetMapping("/getByFirstNameAndLastName")
	DataResult<List<Candidates>> getByFirstNameAndLastName(String firstName,String lastName){
		return this.candidateService.findByFirstNameAndLastName(firstName, lastName);
	}
	
	
	
	
	
	
	
}
