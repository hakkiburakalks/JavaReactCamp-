package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.CandidatesService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
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
}
