package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Education;

public interface EducationService {
	
	
	Result add (Education education);	
	Result update(Education education);
	Result delete(int id);
	DataResult<List<Education>> getAll();
	DataResult<Education> getById(int id);

}
