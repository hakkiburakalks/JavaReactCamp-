package com.example.kodlama.io.HRMS.DataAcces.abstracts;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;

public interface CandidatesDao  extends JpaRepository<Candidates, Integer>{

	
	Candidates findByIdentificationNumber(String identificationNumber);
	List<Candidates> findAllByIdentificationNumber(String identificationNumber);
	 
    List<Candidates> findAllByFirstName(String firstName);
	List<Candidates> findByFirstNameAndIdentificationNumber(String firstName,String identificationNumber);
	List<Candidates> findAllByLastName(String lastName);
	List<Candidates> findByLastNameAndIdentificationNumber(String lastName,String identificationNumber);
	List<Candidates> findByFirstNameAndLastName(String firstName,String lastName);
	
}
