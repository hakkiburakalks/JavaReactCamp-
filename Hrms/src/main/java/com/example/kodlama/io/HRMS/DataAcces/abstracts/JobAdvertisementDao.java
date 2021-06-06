package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.kodlama.io.HRMS.Entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
    List<JobAdvertisement> findByEmployerId(int employerId);
	
	List<JobAdvertisement> findByAllIsActive(boolean isActive);
	
	List<JobAdvertisement> findByAllIsActiveOrderByCreatedDateDesc(boolean isActive);
	
	@Query("From JobAdvertisement where isActive = true and employer_id =:id")
	List<JobAdvertisement> findEmployersActiveJobAdvertisement(int id);

}
 