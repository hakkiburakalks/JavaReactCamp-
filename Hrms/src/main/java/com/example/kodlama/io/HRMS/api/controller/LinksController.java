package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.LinkService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Link;

@RestController
@RequestMapping("/api/links")
public class LinksController {
	private LinkService linkService;
	
	@Autowired
	public LinksController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody Link resumeLink){
		return this.linkService.add(resumeLink);
		
	}
	
	@PostMapping("/update")
	public Result update( @RequestBody Link resumeLink){
		return this.linkService.update(resumeLink);
		
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int  id){
		return this.linkService.delete(id);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Link>> getAll(){
		return this.linkService.getAll();
	}
}
