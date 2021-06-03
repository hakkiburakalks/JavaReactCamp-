package GameCampaignProject;

import java.rmi.RemoteException;

public  class PlayerCheckManager implements PlayerCheckService {
	
	@Override
	public boolean checkPlayer(Player player) throws NumberFormatException, RemoteException{
		System.out.println("Sisteme Baþarý ile kayýt olmuþtur"+player.getPlayerRealName());
		return true;
	}


}
