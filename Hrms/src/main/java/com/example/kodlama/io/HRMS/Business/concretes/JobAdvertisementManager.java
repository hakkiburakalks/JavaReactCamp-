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
		return new SuccessResult("İş ilanı güncellendi.");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş ilanı silindi.");
	}


	@Override
	public DataResult<List<JobAdvertisement>> findAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.findAll(),"Data listelendi.");
	}
	
	
	private Result descriptionNullChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getDescription().isEmpty()) {
			return new ErrorResult("İş tanımı boş bırakılamaz.");
		}
		return new SuccessResult();
	}
	
	private Result ifMinSalaryNull(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() == null) {
			return new ErrorResult("Minimum maaş girilmek zorundadır.");
		}
		return new SuccessResult();
	}
	
	
	private Result ifMaxSalaryNull(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMaxSalary() == null) {
			return new ErrorResult("Maksimum maaş girilmek zorundadır.");
		}
		return new SuccessResult();
	}
	
	private Result minSalaryChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() == 0) {
			return new ErrorResult("Minimum maaş 0 verilemez.");
		}
		return new SuccessResult();
	}
	
	private Result maxSalaryChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMaxSalary() == 0) {
			return new ErrorResult("Maksimum maaş 0 verilemez.");
		}
		return new SuccessResult();
	}
	
	private Result ifMinSalaryEqualsMaxSalary(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getMinSalary() >= jobAdvertisement.getMaxSalary()) {
			return new ErrorResult("Minimum maaş, maksimum maaşa eşit olamaz.");
		}
		return new SuccessResult();
	}
	
	private Result ifQuotaSmallerThanOne(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getQuota() < 1) {
			return new ErrorResult("Açık pozisyon sayısı 1 den küçük olamaz.");
		}
		return new SuccessResult();
	}
	
	private Result appealExpirationChecker(JobAdvertisement jobAdvertisement) {
		if(jobAdvertisement.getAppealExpirationDate() == null) {
			return new ErrorResult("Son başvuru tarihi girilmek zorundadır");
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
