package com.example.kodlama.io.HRMS.Core.Validation;

import com.example.kodlama.io.HRMS.Core.utulities.Result.Result;
import com.example.kodlama.io.HRMS.Core.utulities.Result.SuccessResult;

public class Injection {
	
	public static Result run(Result... logics) {
        for (Result logic : logics) {
            if (!logic.isSuccess()){
                return logic;
            }
        }
        return new SuccessResult();
	}

	public static Result run(Result firstNameChecker, Result lastNameChecker, boolean realPerson, Result idChecker,
			Result birthDateChecker, Result emailNullChecker, Result realEmail, Result passwordNullChecker,
			Result mailRegistered) {
		
		return new Result(realPerson);
	}

}