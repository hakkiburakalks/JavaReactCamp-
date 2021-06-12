package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.LinkService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.LinkDao;
import com.example.kodlama.io.HRMS.Entities.concretes.Link;
@Service
public class LinkManager implements LinkService{

	
	private LinkDao linkDao;
	
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}

	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Link Eklendi!");
	}

	@Override
	public Result update(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Link Güncellendi!");
	}

	@Override
	public Result delete(int id) {
		this.linkDao.deleteById(id);
		return new SuccessResult("Link Silindi!");
	}

	@Override
	public DataResult<Link> getById(int id) {
		return new SuccessDataResult<Link>(this.linkDao.getById(id));
	}

	@Override
	public DataResult<List<Link>> getAll() {
		return new SuccessDataResult<List<Link>>(this.linkDao.findAll());	
	}

}
