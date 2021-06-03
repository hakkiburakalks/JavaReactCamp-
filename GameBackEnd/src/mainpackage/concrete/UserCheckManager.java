package mainpackage.concrete;

import mainpackage.abstracts.UserCheckService;
import mainpackage.entity.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealUser(User user) {
		return true;
	}

}
