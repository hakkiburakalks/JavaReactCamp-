package mainpackage.main;

import mainpackage.Adapter.MernisServiceAdapter;
import mainpackage.concrete.UserManager;
import mainpackage.entity.Campaign;
import mainpackage.entity.Game;
import mainpackage.entity.Sale;
import mainpackage.entity.User;

public class Main {

public static void main(String[] args) {
	
	User burak = new User("HAKKI BURAK", "ALKIÞ", "42283088184",2001);
	UserManager userManager = new UserManager(new MernisServiceAdapter());
     userManager.add(burak);
	
     Game csgo = new Game("CSGO", "1", "FPS");
     Campaign campaign1 = new Campaign(2, 20);
     Sale sale1 = new Sale(1, 1, 18);
     System.out.println(sale1.getPriceOfGame());
	
}	

}
