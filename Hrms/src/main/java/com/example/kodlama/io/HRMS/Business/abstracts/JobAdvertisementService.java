package com.example.kodlama.io.HRMS.Business.abstracts;



import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;

import com.example.kodlama.io.HRMS.Entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	
}
