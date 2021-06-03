package mainpackage.entity;

public class Game {

	private String gameName;
	private String gameId;
	private String gameType;
	public Game(String gameName, String gameId, String gameType) {
		this.gameName = gameName;
		this.gameId = gameId;
		this.gameType = gameType;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
}
