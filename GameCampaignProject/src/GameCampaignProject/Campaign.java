package GameCampaignProject;

public class Campaign {
	private String campaignName;
	private int campaingId;
	private double campaingDiscount;
	
	public Campaign(String campaignName, int campaingId, double campaingDiscount) {
		super();
		this.campaignName = campaignName;
		this.campaingId = campaingId;
		this.campaingDiscount = campaingDiscount;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getCampaingId() {
		return campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	public double getCampaingDiscount() {
		return campaingDiscount;
	}
	public void setCampaingDiscount(double campaingDiscount) {
		this.campaingDiscount = campaingDiscount;
	}

}
