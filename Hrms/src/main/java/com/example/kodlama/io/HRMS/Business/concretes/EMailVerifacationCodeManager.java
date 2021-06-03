package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.kodlama.io.HRMS.Business.abstracts.EMailVerifacationCodeService;
import com.example.kodlama.io.HRMS.Core.Validation.RandomCodeGenerator;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.EMailVerifacationCodeDao;
import com.example.kodlama.io.HRMS.Entities.concretes.EMailVerifacationCode;


public class EMailVerifacationCodeManager implements EMailVerifacationCodeService {


	private EMailVerifacationCodeDao emailVerificationDao;
	
	@Autowired
	public EMailVerifacationCodeManager(EMailVerifacationCodeDao emailVerificationDao) {
		super();
		this.emailVerificationDao = emailVerificationDao;
	}

	@Override
	public void generateCode(EMailVerifacationCode code, Integer id) {
		//EmailVerificationCode _code = code;
		code.setCode(null);
		code.setVerified(false);
		if(code.isVerified() == false) {
			
			RandomCodeGenerator generator = new RandomCodeGenerator();
			String code_create = generator.create();
			code.setCode(code_create);
			code.setUserId(id);
	
			emailVerificationDao.save(code);
			
		}
		return ;
		
	}

	@Override
	public Result verify(String verificationCode, Integer id) {
		EMailVerifacationCode code = this.emailVerificationDao.getOne(id);
		
		EMailVerifacationCode ref = emailVerificationDao.findById(id).stream().findFirst().get();
		if(ref.getCode().equals(verificationCode) && ref.isVerified() != true) {
			ref.setVerified(true);
			return  new SuccessDataResult<EMailVerifacationCode>
			(this.emailVerificationDao.save(ref),"Başarılı");
		}
		else if(ref.isVerified() == true) {
			return  new ErrorDataResult<EMailVerifacationCode>
			(null,"Zaten Doğrulanmış Hesap");
		}
		return  new ErrorDataResult<EMailVerifacationCode>
		(null,"Doğrulama Kodu Geçersiz");

	}
	
}
