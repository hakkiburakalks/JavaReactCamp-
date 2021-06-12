package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
Language getById(int id);
}
