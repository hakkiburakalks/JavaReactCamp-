package GameCampaignProject;

public class DiscountManager {
	public static double discountManager(GameSale gameSale,Campaign campaing) {
		return gameSale.getGamePrice() - ((gameSale.getGamePrice()*campaing.getCampaingDiscount())/100);
	}

}
