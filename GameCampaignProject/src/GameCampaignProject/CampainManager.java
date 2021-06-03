package GameCampaignProject;

public class CampainManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya eklenmiþtir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya silinmiþtir");
		
	}

	@Override
	public void updataCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya güncellenmiþtir");
		
	}

	@Override
	public void discount(Campaign campaign,Game game) {
		System.out.println(game.getGameName()+"adlý oyuna"+campaign.getCampaignName()+" Kampanyasý uygulanmýþtýr");
		
	}


}
