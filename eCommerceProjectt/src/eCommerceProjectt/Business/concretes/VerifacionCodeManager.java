package eCommerceProjectt.Business.concretes;

import java.util.Random;

import eCommerceProjectt.Business.abstracts.VerifacionCodeService;

public class VerifacionCodeManager implements VerifacionCodeService {
	@Override
	public void sendActivationCode() {
		 Random rnd = new Random();
		 int activationcode = rnd.nextInt(20)*12345678;
		 System.out.println("Mail içeriði "+activationcode);
		
	}

}
