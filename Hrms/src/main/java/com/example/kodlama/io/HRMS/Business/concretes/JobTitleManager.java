package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.JobTitleService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.JobTitleDao;
import com.example.kodlama.io.HRMS.Entities.concretes.JobTitle;




@Service
public class JobTitleManager implements JobTitleService {
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}



	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>
		(jobTitleDao.findAll(),"Başarılı Şekilde Listelendi");
		
	}

}
