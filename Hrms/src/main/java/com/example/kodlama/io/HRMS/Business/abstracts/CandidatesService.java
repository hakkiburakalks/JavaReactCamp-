package com.example.kodlama.io.HRMS.Business.abstracts;

import java.sql.Date;
import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;




public interface CandidatesService {

	DataResult<List<Candidates>> getAll();
	DataResult<Candidates> add(Candidates candidate);
	
	
	
	DataResult<List<Candidates>> findByAllEmail(String email);
	DataResult<Candidates> findByEmail(String email);
	DataResult<Candidates> findByIdentificationNumber(String identificationNumber);
	DataResult<List<Candidates>> findByAllIdentificationNumber(String identificationNumber);
	DataResult<List<Candidates>> findByAllFirstName(String firstName);
	DataResult<List<Candidates>> findByFirstNameAndIdentificationNumber(String firstName,String identificationNumber);
	DataResult<List<Candidates>> findByAllLastName(String lastName);
	DataResult<List<Candidates>> findByLastNameAndIdentificationNumber(String lastName,String identificationNumber);
	DataResult<List<Candidates>> findByFirstNameAndLastName(String firstName,String lastName);
	
}
