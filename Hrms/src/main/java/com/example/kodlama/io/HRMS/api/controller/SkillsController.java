package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.SkillsService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Skills;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

private SkillsService skillService;
	
	
	@Autowired
	public SkillsController(SkillsService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody Skills resumeSkill){
		return this.skillService.add(resumeSkill);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody Skills resumeSkill){
		return this.skillService.update(resumeSkill);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.skillService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Skills>> getAll(){
		return this.skillService.getAll();
	}
	
	
	
}
