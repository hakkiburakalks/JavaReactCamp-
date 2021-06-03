package eCommerceProjectt.Business.abstracts;
import java.util.List;
import eCommerceProjectt.Entities.concretes.User;

public interface UserService {
 void add(User user);
 void delete(User user);
 void update(User user);
 List<User> getAll();
 void checkservice(User user);
 
}
