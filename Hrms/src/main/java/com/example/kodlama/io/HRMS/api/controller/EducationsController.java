package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.EducationService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {

private EducationService educationService;
	
	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education schoolForCV){
		return this.educationService.add(schoolForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Education schoolForCV){
		return this.educationService.update(schoolForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.educationService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Education> getById(@RequestParam int id){
		return this.educationService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	
	
	
	
	
	
	
	
	
}
