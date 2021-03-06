package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link, Integer> {
	Link getById(int id);
}
