package mainpackage.concrete;

import mainpackage.abstracts.CampaignService;
import mainpackage.entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getId()+" Kodlu kampanya sisteme eklenmiştir");
		
	}

	@Override
	public void delete(Campaign campaign) {
	   System.out.println(campaign.getId()+" kodlu kampanya silinmiştir");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId()+" kodlu kampanya silinmiştir1");
		
	}

}
