package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.UserService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.UserDao;
import com.example.kodlama.io.HRMS.Entities.concretes.User;


@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listelendi" );
	}

	@Override
	public User add(User user) {
		return userDao.save(user);
	}

}
