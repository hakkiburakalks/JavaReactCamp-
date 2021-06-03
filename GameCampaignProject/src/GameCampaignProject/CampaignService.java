package GameCampaignProject;

public interface CampaignService {

	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updataCampaign(Campaign campaign);
	void discount(Campaign campaign,Game game);
}
