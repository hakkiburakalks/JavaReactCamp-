package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.SkillsService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.SkillDao;
import com.example.kodlama.io.HRMS.Entities.concretes.Skills;
@Service
public class SkillsManager implements SkillsService{

	private SkillDao skillDao;
	
	@Autowired
	public SkillsManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skills resumeSkill) {
		this.skillDao.save(resumeSkill);
		return new SuccessResult("Yetenek Bilgisi Başarıyla Eklenmiştir");
	}

	@Override
	public Result update(Skills resumeSkill) {
		this.skillDao.save(resumeSkill);
		return new SuccessResult("Yetenek Bilgisi Başarıyla Güncellenmiştir");
	}

	@Override
	public Result delete(int id) {
		this.skillDao.deleteById(id);
		return new SuccessResult("Yetenek Bilgileriniz Silindi!");
	}

	@Override
	public DataResult<Skills> getById(int id) {
		return new SuccessDataResult<Skills>(this.skillDao.getById(id));
	}

	@Override
	public DataResult<List<Skills>> getAll() {
		return new SuccessDataResult<List<Skills>>(this.skillDao.findAll());
	}

}
