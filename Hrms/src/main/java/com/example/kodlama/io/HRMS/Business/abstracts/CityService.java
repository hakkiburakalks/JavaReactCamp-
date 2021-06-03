package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.City;


public interface CityService {
	DataResult<List<City>> getAll();
	DataResult<City> add(City city);
}
