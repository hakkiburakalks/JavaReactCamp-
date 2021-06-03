package GameCampaignProject;

import java.time.LocalDate;

public class Player {
	private int id;
	private String nationalId;
	private String playerRealName;
	private String playerRealSurName;
	private LocalDate dateOfBirth;
	
	public Player(int id, String nationalId, String playerRealName, String playerRealSurName, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.nationalId = nationalId;
		this.playerRealName = playerRealName;
		this.playerRealSurName = playerRealSurName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalId() {
		return this.nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getPlayerRealName() {
		return playerRealName;
	}

	public void setPlayerRealName(String playerRealName) {
		this.playerRealName = playerRealName;
	}

	public String getPlayerRealSurName() {
		return playerRealSurName;
	}

	public void setPlayerRealSurName(String playerRealSurName) {
		this.playerRealSurName = playerRealSurName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
