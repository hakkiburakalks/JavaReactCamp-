package HomeWorkSix;

public class UserManager {
	
	public void add(User user) {
	   System.out.println("Yeni Kullanýcý eklendi"+user.getName());	
	}
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi"+user.getName());
	}
	public void login() {
		System.out.println("Giris Yapildi");
	}
	
	public void changeTelephoneNumber(String phoneNumber) {
		System.out.println("Telefon Numaranýz "+phoneNumber+" olarak deðiþtirilmiþtir");
	}
	public void changeNationalIdenity(String nationalIdenity) {
		System.out.println("Kimlik Numaranýz"+nationalIdenity+"olarak deðiþtirilmiþtir");
	}
	
	
}
