package com.example.kodlama.io.HRMS.Business.abstracts;

import java.util.List;

import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Entities.concretes.EMailVerifacationCode;



public interface EMailVerifacationCodeService {
	void generateCode(EMailVerifacationCode code, Integer id);
	Result verify(String verificationCode, Integer id);
	
}
