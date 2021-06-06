package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.CityService;
import com.example.kodlama.io.HRMS.Core.Validation.Injection;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.CityDao;
import com.example.kodlama.io.HRMS.Entities.concretes.City;

import net.bytebuddy.asm.Advice.This;


@Service
public class CityManager implements CityService{
	 private CityDao cityDao;
    @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

    
  
	
	private Result cityNameChecker(City city) {
		
		if(city.getCityName().isEmpty() || city.getCityName().isBlank()) {
			return new ErrorResult("Şehir alanı zorunlu.");
		}
		else {
			return new SuccessResult();
		}
		
	}

	@Override
	public DataResult<City> add(City city) {
      Result inject = Injection.run(cityNameChecker(city));
		
		if(!inject.isSuccess()) {
			
			return new ErrorDataResult<City>
					(null,inject.getMessage());
		}
		return new SuccessDataResult<City>
		(this.cityDao.save(city),"Başarılı şekilde eklendi.");
	}




	@Override
	public DataResult<List<City>> findAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Data listelendi");
	}

}
