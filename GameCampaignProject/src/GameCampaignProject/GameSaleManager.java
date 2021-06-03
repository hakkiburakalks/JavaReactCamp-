package GameCampaignProject;

public class GameSaleManager implements GameSaleService {

	
	public  GameSaleManager() {
	System.out.println("Oyun satýþ ekranýna hoþ geldiniz");
	}

	@Override
	public void showGame(Game game) {
		System.out.println(game.getGameName()+" adlý oyun ekrana getirilmiþtir");
	}



	@Override
	public void buyGame(GameSale gameSale, Player player) {
		System.out.println(player.getPlayerRealName()+"adlý oyuncu"+gameSale.getGameName()+" adlý oyunu satýn aldý");
		System.out.println(" Güle Güle oynayýn :) ");
		
	}

	

}
