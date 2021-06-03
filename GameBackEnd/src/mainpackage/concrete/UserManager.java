package mainpackage.concrete;

import mainpackage.abstracts.UserCheckService;
import mainpackage.abstracts.UserService;
import mainpackage.entity.User;

public class UserManager implements UserService{
	private UserCheckService usercheckservice;

	public UserManager(UserCheckService usercheckservice) {
		this.usercheckservice = usercheckservice;
	}

	@Override
	public void add(User user) {
		
		if(this.usercheckservice.checkIfRealUser(user)) {
			System.out.println("Database Kayýt Baþarýlý"+user.getUserName());
		}
		else {
			System.out.println("Baþarýlý Deðil");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" adlý oyuncu sistemden silinmiþtir");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println(user.getUserName()+" adlý kullanýcý güncellenmiþtir");
	}

}
