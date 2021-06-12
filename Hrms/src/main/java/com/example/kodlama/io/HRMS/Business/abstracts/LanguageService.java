package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	Result update(Language language);
	Result delete(int id);
	DataResult<Language> getById(int id);
	DataResult<List<Language>>  getAll();
}
