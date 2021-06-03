package GameCampaignProject;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName()+ "adlý oyun eklenmiþtir");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+" adlý oyun silinmiþtir");
		 
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName()+" adlý oyun güncellenmiþtir");
	}

}
