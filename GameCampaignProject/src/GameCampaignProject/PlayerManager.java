package GameCampaignProject;

public class PlayerManager implements PlayerService {

	 private PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		
		this.setPlayerCheckService(playerCheckService);
	}

	@Override
	public void playerAdd(Player player) {
		System.out.println("Oyuncu Eklendi :"+player.getPlayerRealName());		
	}

	@Override
	public void playerDelete(Player player) {
		System.out.println("Oyuncu Silindi :"+player.getPlayerRealName());
		
	}

	@Override
	public void playerUpdate(Player player) {
		System.out.println("Oyuncu güncellendi :"+player.getPlayerRealName());
		
	}

	public PlayerCheckService getPlayerCheckService() {
		return playerCheckService;
	}

	public void setPlayerCheckService(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

}
