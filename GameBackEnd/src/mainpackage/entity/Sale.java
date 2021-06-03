package mainpackage.entity;

public class Sale {
	private int gameId;
	private int campaignId;
	private int priceOfGame;
	public Sale(int gameId, int campaignId,int priceOfGame) {
		super();
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.priceOfGame = priceOfGame;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getPriceOfGame() {
		return priceOfGame;
	}
	public void setPriceOfGame(int priceOfGame) {
		this.priceOfGame = priceOfGame;
	}
}
