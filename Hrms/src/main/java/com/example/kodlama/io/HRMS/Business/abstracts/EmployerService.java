package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	DataResult<Employer> add(Employer employer);
	
	DataResult<Employer> findByCompanyName(String companyName);
	DataResult<List<Employer>> findByAllCompanyName(String companyName);
	DataResult<Employer> findByWebAdress(String webAdress);
	DataResult<List<Employer>> findByAllWebAdress(String webAdress);
}
