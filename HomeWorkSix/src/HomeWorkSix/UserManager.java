package HomeWorkSix;

public class UserManager {
	
	public void add(User user) {
	   System.out.println("Yeni Kullanıcı eklendi"+user.getName());	
	}
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi"+user.getName());
	}
	public void login() {
		System.out.println("Giris Yapildi");
	}
	
	public void changeTelephoneNumber(String phoneNumber) {
		System.out.println("Telefon Numaranız "+phoneNumber+" olarak değiştirilmiştir");
	}
	public void changeNationalIdenity(String nationalIdenity) {
		System.out.println("Kimlik Numaranız"+nationalIdenity+"olarak değiştirilmiştir");
	}
	
	
}
