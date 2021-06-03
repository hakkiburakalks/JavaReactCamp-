package eCommerceProjectt;



import eCommerceProjectt.Business.concretes.ActivationManager;
import eCommerceProjectt.Business.concretes.UserCheckManager;
import eCommerceProjectt.Business.concretes.UserManager;
import eCommerceProjectt.Business.concretes.VerifacionCodeManager;
import eCommerceProjectt.Entities.concretes.User;

public class Main {
 public static void main(String[] args) {
	 
	 
	 User user = new User("B","Alkýþ","hakkiburakalks@gmail.com","12121212");
	 User user1 = new User("kasdas","d","cdasdasdas@gmail.com"," 1312321");
	 UserCheckManager.emailChecker(user.getMail());
	
	UserManager userManager = new UserManager(new VerifacionCodeManager()); 
	userManager.checkservice(user);
	 userManager.checkservice(user1);
	ActivationManager activationManager = new ActivationManager ();
	activationManager.clickEmail();
	
	
	
	
			
 }}
