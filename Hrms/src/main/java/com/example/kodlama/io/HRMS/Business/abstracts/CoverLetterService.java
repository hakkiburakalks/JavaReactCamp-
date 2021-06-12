package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.CoverLetter;

public interface CoverLetterService {

	Result add(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(int id);
	DataResult<CoverLetter> getById(int id);	
	DataResult<List<CoverLetter>> getAll();
}