package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Skills;

public interface SkillsService {
	
	Result add(Skills resumeSkill);
	Result update(Skills resumeSkill);
	Result delete(int id);
	DataResult<Skills> getById(int id);	
	DataResult<List<Skills>> getAll();
}
