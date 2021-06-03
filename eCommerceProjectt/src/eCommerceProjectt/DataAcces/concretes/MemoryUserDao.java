package eCommerceProjectt.DataAcces.concretes;

import java.util.List;

import eCommerceProjectt.DataAcces.abstracts.UserDao;
import eCommerceProjectt.Entities.concretes.User;

public class MemoryUserDao implements UserDao {

	@Override
	public void Add(User user) {
		 System.out.println(user.getName()+" adlý kullanýcý sisteme eklenmiþtir");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getName()+" adlý kullanýcý sistemden silinmiþtir");
		
	}

	@Override
	public void Update(User user) {
		 System.out.println(user.getName()+" adlý kullanýcý güncellenmiþtir");
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
