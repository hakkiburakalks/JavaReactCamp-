package com.example.kodlama.io.HRMS.DataAcces.abstracts;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;

public interface CandidatesDao  extends JpaRepository<Candidates, Integer>{
	List<Candidates> findByAllEmail(String email);
	Candidates findByEmail(String email);
	
	Candidates findByIdentificationNumber(String identificationNumber);
	List<Candidates> findByAllIdentificationNumber(String identificationNumber);
	 
    List<Candidates> findByAllFirstName(String firstName);
	List<Candidates> findByFirstNameAndIdentificationNumber(String firstName,String identificationNumber);
	List<Candidates> findByAllLastName(String lastName);
	List<Candidates> findByLastNameAndIdentificationNumber(String lastName,String identificationNumber);
	List<Candidates> findByFirstNameAndLastName(String firstName,String lastName);
	
}
