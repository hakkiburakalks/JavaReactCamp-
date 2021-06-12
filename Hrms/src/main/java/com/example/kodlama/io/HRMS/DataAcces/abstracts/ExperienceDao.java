package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{
	Experience getById(int id);
}
