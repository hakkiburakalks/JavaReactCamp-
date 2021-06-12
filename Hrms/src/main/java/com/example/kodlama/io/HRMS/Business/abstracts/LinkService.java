package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.Link;

public interface LinkService {
	Result add(Link link);
	Result update(Link link);
	Result delete(int id);
    DataResult<Link> getById(int id);	
    DataResult<List<Link>> getAll();
}
