package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.CoverLetterService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletter")

public class CoverLetterController {

	private CoverLetterService coverLetterService;
	@Autowired
    public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody CoverLetter coverLetter){
		return this.coverLetterService.add(coverLetter);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody CoverLetter coverLetter){
		return this.coverLetterService.update(coverLetter);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int letterId){
		return this.coverLetterService.delete(letterId);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getAll(){
		return this.coverLetterService.getAll();
	}
	
	
	
}
