package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.JobAdvertisementService;
import com.example.kodlama.io.HRMS.Core.Validation.Injection;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.CityDao;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.EmployerDao;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.JobAdvertisementDao;
import com.example.kodlama.io.HRMS.Entities.concretes.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	private EmployerDao employerDao;
	private CityDao cityDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao,
			EmployerDao employerDao, CityDao cityDao) {
		
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
		this.employerDao = employerDao;
		this.cityDao = cityDao;
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		Result inject = Injection.run(
				descriptionNullChecker(jobAdvertisement),
				ifMinSalaryNull(jobAdvertisement),ifMaxSalaryNull(jobAdvertisement),minSalaryChecker(jobAdvertisement),
				maxSalaryChecker(jobAdvertisement),ifMinSalaryEqualsMaxSalary(jobAdvertisement),ifQuotaSmallerThanOne(jobAdvertisement),
				appealExpirationChecker( jobAdvertisement));
		
		if(!inject.isSuccess()) {
			
			return new ErrorResult(inject.getMessage());
		}
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("???? ilan?? g??ncellendi.");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("???? ilan?? silindi.");
	}


	@Override
	public DataResult<List<JobAdvertisement>> findAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.findAll(),"Data listelendi.");
	}
	
	
	private Result descriptionNullChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getDescription().isEmpty()) {
			return new ErrorResult("???? tan??m?? bo?? b??rak??lamaz.");
		}
		return new SuccessResult();
	}
	
	private Result ifMinSalaryNull(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() == null) {
			return new ErrorResult("Minimum maa?? girilmek zorundad??r.");
		}
		return new SuccessResult();
	}
	
	
	private Result ifMaxSalaryNull(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMaxSalary() == null) {
			return new ErrorResult("Maksimum maa?? girilmek zorundad??r.");
		}
		return new SuccessResult();
	}
	
	private Result minSalaryChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() == 0) {
			return new ErrorResult("Minimum maa?? 0 verilemez.");
		}
		return new SuccessResult();
	}
	
	private Result maxSalaryChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMaxSalary() == 0) {
			return new ErrorResult("Maksimum maa?? 0 verilemez.");
		}
		return new SuccessResult();
	}
	
	private Result ifMinSalaryEqualsMaxSalary(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() >= jobAdvertisement.getMaxSalary()) {
			return new ErrorResult("Minimum maa??, maksimum maa??a e??it olamaz.");
		}
		return new SuccessResult();
	}
	
	private Result ifQuotaSmallerThanOne(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getQuota() < 1) {
			return new ErrorResult("A????k pozisyon say??s?? 1 den k??????k olamaz.");
		}
		return new SuccessResult();
	}
	
	private Result appealExpirationChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getAppealExpirationDate() == null) {
			return new ErrorResult("Son ba??vuru tarihi girilmek zorundad??r");
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByEmployerId(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByEmployerId(employerId),"Data Listelendi");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByAllIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByIsActive(isActive),"Data Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByAllIsActiveOrderByCreatedDateDesc(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByIsActiveOrderByCreatedDateDesc(isActive),"Data Listelendi");
		
	}
}
