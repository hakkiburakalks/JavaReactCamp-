package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Image;

public interface ImageDao  extends JpaRepository<Image, Integer>{

	Image getById(int id);
	
	
}
