package com.example.kodlama.io.HRMS.Business.concretes;


import java.sql.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kodlama.io.HRMS.Business.abstracts.CandidatesService;
import com.example.kodlama.io.HRMS.Business.abstracts.EMailVerifacationCodeService;
import com.example.kodlama.io.HRMS.Business.abstracts.UserService;
import com.example.kodlama.io.HRMS.Core.Validation.Injection;
import com.example.kodlama.io.HRMS.Core.utulities.Result.DataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.ErrorResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessDataResult;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;
import com.example.kodlama.io.HRMS.DataAcces.abstracts.CandidatesDao;
import com.example.kodlama.io.HRMS.Entities.concretes.Candidates;
import com.example.kodlama.io.HRMS.Entities.concretes.EMailVerifacationCode;
import com.example.kodlama.io.HRMS.Entities.concretes.User;



@Service
public class CandidatesManager implements CandidatesService {
	private CandidatesDao candidateDao;
	private EMailVerifacationCodeService verificationCodeService;
	private UserService userService;
	
	@Autowired
	public CandidatesManager(CandidatesDao candidateDao, EMailVerifacationCodeService verificationCodeService,
			UserService userService) {
		super();
		this.candidateDao = candidateDao;
		this.verificationCodeService = verificationCodeService;
		this.userService = userService;
	}

	
	@Override
	public DataResult<List<Candidates>> getAll() {
		
		return new SuccessDataResult<List<Candidates>>
		(this.candidateDao.findAll(),"Data Listelendi");
	
	}

	
	@Override
	public DataResult<Candidates> add(Candidates candidate) {
		
		Result engine = Injection.run(firstNameChecker(candidate),lastNameChecker(candidate),
				
				idChecker(candidate),
				birthDateChecker(candidate),
				emailNullChecker(candidate),
				CheckRealEMail(candidate),
				passwordNullChecker(candidate)
				);
		if(!engine.isSuccess()) {
			return new ErrorDataResult(null,engine.getMessage());
		}
		
		User savedUser = this.userService.add(candidate);
		this.verificationCodeService.generateCode(new EMailVerifacationCode(),savedUser.getId());
		return new SuccessDataResult<Candidates>
		(this.candidateDao.save(candidate)," ");
		
		
	}
	
	
	


	public Result firstNameChecker (Candidates candidate) {
		if (candidate.getFirstName().isBlank() || candidate.getFirstName().equals(null)) {
			return new ErrorResult("İsim kısmı boş bırakılmamalıdır");
		}
		else {
			return new SuccessResult();
		}
		   }

	public Result lastNameChecker(Candidates candidate) {
		if(candidate.getLastName().isBlank() || candidate.getLastName().equals(null)) {
			return new ErrorResult("Soyisim kısmı boş bırakılmamalıdır");
		}
		else {
			return new SuccessResult();
		}
		}
	
	private Result birthDateChecker(Candidates candidate) {
		if(candidate.getBirthDate().equals(null)) {
			return new ErrorResult("Doğum Tarihi Boş Bırakılmamalıdır");
		}
		else {
			return new SuccessResult();
		}
		
	}
	private Result emailNullChecker(Candidates candidate) {
		if(candidate.getEmailAdress().isBlank() || candidate.getEmailAdress().equals(null)) {
			return new ErrorResult("Mail Alanı Boş Bırakılmamalıdır");
		}
		return new SuccessResult();
	}
	private Result passwordNullChecker (Candidates candidate) {
		if(candidate.getPassword().isBlank() || candidate.getPassword().equals(null)) {
			return new ErrorResult("Parola Kısmı Boş Bırakılmamalıdır");
		}
		return new SuccessResult();
	}
	
	private Result CheckRealEMail(Candidates candidate) {
		 String EMAIL_PATTERN =
	            "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"
	            + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";

	   Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	   Matcher matcher = pattern.matcher(candidate.getEmailAdress());
	   if (!matcher.matches()) {
		   return new ErrorResult("Email koşullarına uymuyor");
	   }
	  
		   return new SuccessResult();
	    }
	     
	    private Result idChecker(Candidates candidate) {
	    	if(candidate.getIdentificationNumber().isBlank() || candidate.getIdentificationNumber().equals(null)) {
	    		return new ErrorResult("ID Boş Gönderilemez");
	    	}
	    	return new SuccessResult();
	    }


		@Override
		public DataResult<List<Candidates>> findByAllEmail(String email) {
					
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByAllEmail(email),"Data Listelendi");
		}


		@Override
		public DataResult<Candidates> findByEmail(String email) {
			return new SuccessDataResult<Candidates>(this.candidateDao.findByEmail(email),"Data Listelendi");
		}


		@Override
		public DataResult<Candidates> findByIdentificationNumber(String identificationNumber) {
			return new SuccessDataResult<Candidates>(this.candidateDao.findByIdentificationNumber(identificationNumber),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByAllIdentificationNumber(String identificationNumber) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByAllIdentificationNumber(identificationNumber),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByAllFirstName(String firstName) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByAllFirstName(firstName),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByFirstNameAndIdentificationNumber(String firstName,	String identificationNumber) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByFirstNameAndIdentificationNumber(firstName, identificationNumber),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByAllLastName(String lastName) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByAllLastName(lastName),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByLastNameAndIdentificationNumber(String lastName,
				String identificationNumber) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByLastNameAndIdentificationNumber(lastName, identificationNumber),"Data Listelendi");
		}


		@Override
		public DataResult<List<Candidates>> findByFirstNameAndLastName(String firstName, String lastName) {
			return new SuccessDataResult<List<Candidates>>(this.candidateDao.findByFirstNameAndLastName(firstName, lastName),"Data Listelendi");
		}


	
	    		
	    		
		
}
