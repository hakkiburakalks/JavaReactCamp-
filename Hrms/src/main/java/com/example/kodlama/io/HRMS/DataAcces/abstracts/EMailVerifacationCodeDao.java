package com.example.kodlama.io.HRMS.DataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kodlama.io.HRMS.Entities.concretes.EMailVerifacationCode;

public interface EMailVerifacationCodeDao extends JpaRepository<EMailVerifacationCode, Integer>{

}
