package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Experience;

public interface ExperienceService{
	Result add(Experience resumeExperience);
	Result update(Experience resumeExperience);
	Result delete(int id);
	DataResult<Experience> getById(int id);
	DataResult<List<Experience>> getAll();
}
