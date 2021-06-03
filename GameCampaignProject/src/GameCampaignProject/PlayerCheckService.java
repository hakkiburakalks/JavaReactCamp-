package GameCampaignProject;

import java.rmi.RemoteException;

public interface PlayerCheckService {
 boolean checkPlayer(Player player) throws NumberFormatException,RemoteException;

}
