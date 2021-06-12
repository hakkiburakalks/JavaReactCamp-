package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Image;

public interface ImageService {
	
	
	Result add(Image resumeImage);
	Result update(Image resumeImage);
	Result delete(int id);
	DataResult<Image> getById(int id);	
	DataResult<List<Image>> getAll();
	
	
	
	
	
}
