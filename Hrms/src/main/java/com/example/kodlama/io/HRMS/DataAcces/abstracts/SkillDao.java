package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Skills;

public interface SkillDao extends JpaRepository<Skills, Integer> {
Skills getById(int id);
}
