package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.JobAdvertisementService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
    DataResult<List<JobAdvertisement>> findAll(){
    	return this.jobAdvertisementService.findAll();
    }
	
	DataResult<List<JobAdvertisement>> findByEmployerId(int employerId){
		return this.jobAdvertisementService.findByEmployerId(employerId);
	}
		
	DataResult<List<JobAdvertisement>> findByAllIsActive(boolean isActive){
		return this.jobAdvertisementService.findByAllIsActive(isActive);
	}
		
	DataResult<List<JobAdvertisement>> findByAllIsActiveOrderByCreatedDateDesc(boolean isActive){
		return this.jobAdvertisementService.findByAllIsActiveOrderByCreatedDateDesc(isActive);
	}
}
