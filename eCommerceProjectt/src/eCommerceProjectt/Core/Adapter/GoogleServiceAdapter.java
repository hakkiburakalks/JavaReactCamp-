package eCommerceProjectt.Core.Adapter;

import eCommerceProjectt.Validator.GoogleValidatorManager;

public class GoogleServiceAdapter implements GoogleAuthService {

	@Override
	public void login() {
		 GoogleValidatorManager googleValidatorManager = new GoogleValidatorManager();
		googleValidatorManager.log();
		
	}

	@Override
	public void register() {
		
	}

	
	
	
	
	
	
}
