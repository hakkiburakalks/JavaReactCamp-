package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.ImageService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.ImageDao;
import com.example.kodlama.io.HRMS.Entities.concretes.Image;
@Service
public class ImageManager implements ImageService {
	
	private ImageDao ImageDao;
	

	@Autowired
	public ImageManager(ImageDao ImageDao) {
		super();
		this.ImageDao = ImageDao;
	}

	
	@Override
	public Result add(Image resumeImage) {
		return null;
	}

	
	@Override
	public Result update(Image resumeImage) {
		this.ImageDao.save(resumeImage);
		return new SuccessResult("Fotoğrafınız Güncellenmiştir!");
	}

	@Override
	public Result delete(int id) {
		this.ImageDao.deleteById(id);
		return new SuccessResult("Fotoğrafınız Silinmiştir!");
	}

	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>(this.ImageDao.getById(id));

	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.ImageDao.findAll());	
	}

}
