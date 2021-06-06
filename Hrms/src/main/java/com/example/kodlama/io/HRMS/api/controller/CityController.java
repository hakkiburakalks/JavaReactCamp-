package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.CityService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.City;

@RestController
@RequestMapping("/api/city")

public class CityController {
	@Autowired
	private CityService cityService;
	


	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return this.cityService.findAll();
	}
	
	@PostMapping("/add")
	public DataResult<City> add(City city){
		return this.cityService.add(city);
	}

}
