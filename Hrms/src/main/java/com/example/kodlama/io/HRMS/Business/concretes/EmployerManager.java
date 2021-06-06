package com.example.kodlama.io.HRMS.Business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.EMailVerifacationCodeService;
import com.example.kodlama.io.HRMS.Business.abstracts.EmployerService;
import com.example.kodlama.io.HRMS.Business.abstracts.UserService;
import com.example.kodlama.io.HRMS.Core.Validation.Injection;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.EmployerDao;
import com.example.kodlama.io.HRMS.Entities.concretes.EMailVerifacationCode;
import com.example.kodlama.io.HRMS.Entities.concretes.Employer;
import com.example.kodlama.io.HRMS.Entities.concretes.User;
@Service
public class EmployerManager implements EmployerService {

	
	private EmployerDao employerDao;
	private EMailVerifacationCodeService verificationCodeService;
	private UserService userService;
	@Autowired
	public EmployerManager(EmployerDao employerDao, EMailVerifacationCodeService verificationCodeService,
			UserService userService) {
		super();
		this.employerDao = employerDao;
		this.verificationCodeService = verificationCodeService;
		this.userService = userService;
	}
	
	@Override
	public DataResult<Employer> add(Employer employer) {
		
		Result engine = Injection.run(
				companyNameChecker(employer),webSiteChecker(employer),passwordNullChecker(employer),
				isRealEmployer(employer),isRealPhoneNumber(employer));
		
		if(!engine.isSuccess()) {
			return new ErrorDataResult(null,engine.getMessage());
		}
		
		User savedUser = this.userService.add(employer);
		this.verificationCodeService.generateCode(new EMailVerifacationCode(),savedUser.getId());
		return new SuccessDataResult<Employer>(this.employerDao.save(employer),
				"İş Veren Hesabı Eklendi, Doğrulama Kodu Gönderildi ID:"+employer.getId());
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Data Listelendi");
	}

	private Result companyNameChecker(Employer employer) {
		if(employer.getCompanyName().isBlank() || employer.getCompanyName() == null) {
			return new ErrorResult("Bu alan boş bırakılamaz");
		}
		return new SuccessResult();
	}
	
	private Result webSiteChecker(Employer employer) {
		if(employer.getWebAdress().isBlank() || employer.getWebAdress() == null) {
			return new ErrorResult("Bu alan boş bırakılamaz");
		}
		return new SuccessResult();
	}
	
	private Result isRealEmployer(Employer employer) {
		 String regex = "^(.+)@(.+)$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(employer.getEmailAdress());
	     if(!matcher.matches()) {
	    	 return new ErrorResult("Geçersiz Email Adresi");
	     }
	     else if(!employer.getEmailAdress().contains(employer.getWebAdress())) {
	    	 return new ErrorResult("Bu alan boş bırakılamazz"); 
	     }
	 	return new SuccessResult();
	     
	}
	
	
	private Result passwordNullChecker(Employer employer) {
		if(employer.getPassword().isBlank() || employer.getPassword() == null) {
			 return new ErrorResult("Bu alan boş bırakılamaz"); 
		}
		return new SuccessResult();
	}
	
	private Result isRealPhoneNumber(Employer employer) {
		String patterns 
	      = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
	      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
	      + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";
		
		Pattern pattern = Pattern.compile(patterns);
		Matcher matcher = pattern.matcher(employer.getPhoneNumber());
		if(!matcher.matches()) {
			 return new ErrorResult("Geçersiz Telefon Numarası"); 
		}
		return new SuccessResult();
		
	}

	@Override
	public DataResult<Employer> findByCompanyName(String companyName) {
		return new SuccessDataResult<Employer>(this.employerDao.findByCompanyName(companyName), "Data Listelendi");
	}

	@Override
	public DataResult<List<Employer>> findByAllCompanyName(String companyName) {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAllByCompanyName(companyName),"Data Listelendi");
	}

	@Override
	public DataResult<Employer> findByWebAdress(String webAdress) {
		return new SuccessDataResult<Employer>(this.employerDao.findByWebAdress(webAdress),"Data Listelendi");
	}

	@Override
	public DataResult<List<Employer>> findByAllWebAdress(String webAdress) {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAllByWebAdress(webAdress),"Data Listelendi");
	}
}
