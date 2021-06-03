package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	
	User add(User user);
	
}
