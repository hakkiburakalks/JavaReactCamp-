package com.example.kodlama.io.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kodlama.io.HRMS.Business.abstracts.EMailVerifacationCodeService;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Entities.concretes.Employer;

@RestController
@RequestMapping("/api/verification")
public class EMailVerifacionController {
private EMailVerifacationCodeService verificationCodeService;
@Autowired
public EMailVerifacionController(EMailVerifacationCodeService verificationCodeService) {
	super();
	this.verificationCodeService = verificationCodeService;
}

}
	

