package GameCampaignProject;

public class CampainManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya eklenmiştir");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya silinmiştir");
		
	}

	@Override
	public void updataCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanya güncellenmiştir");
		
	}

	@Override
	public void discount(Campaign campaign,Game game) {
		System.out.println(game.getGameName()+"adlı oyuna"+campaign.getCampaignName()+" Kampanyası uygulanmıştır");
		
	}


}
