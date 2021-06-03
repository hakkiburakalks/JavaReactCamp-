package eCommerceProjectt.DataAcces.abstracts;
import java.util.List;
import eCommerceProjectt.Entities.concretes.User;

public interface UserDao {
	void Add(User user);
	void Delete(User user);
	void Update(User user);
	User get(String email);

	List<User> getAll();
	


}
