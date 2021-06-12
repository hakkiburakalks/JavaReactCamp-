package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.LanguageService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	
	@Autowired
	private LanguageService languageService;
	
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody Language language){
		return this.languageService.add(language);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody Language language){
		return this.languageService.update(language);
		
	}
	
	@PostMapping("/delete")
	public Result delete( @RequestParam int  id){
		return this.languageService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}

}
