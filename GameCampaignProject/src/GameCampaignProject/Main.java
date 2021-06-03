package GameCampaignProject;

import java.rmi.RemoteException;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) throws RemoteException{
	        Player burak = new Player(1, "42283088184", "HAKKI BURAK", "ALKIÞ", LocalDate.of(2001, 10, 27));
	        PlayerCheckManager playerCheckManager = new PlayerCheckManager();
	        playerCheckManager.checkPlayer(burak);
	        
	        
	        
	        
	}
	        
	}


