package GameCampaignProject;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis implements PlayerCheckService{

	



	@Override
	public boolean checkPlayer(Player player) {
		KPSPublicSoapProxy kpsPublicSoapProxy= new KPSPublicSoapProxy();
		 boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
									    Long.parseLong(player.getNationalId()), 
										player.getPlayerRealName().toUpperCase(), 
										player.getPlayerRealSurName().toUpperCase(), 
										player.getDateOfBirth().getYear());
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}




}
