package mainpackage.entity;

public class User {

	private String userName;
	private String userSurname;
	private String userNationalId;
    private int dateOfBirth;
	public User(String userName, String userSurname, String userNationalId, int dateOfBirth) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.userNationalId = userNationalId;
		this.dateOfBirth = dateOfBirth;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public String getUserNationalId() {
		return userNationalId;
	}
	public void setUserNationalId(String userNationalId) {
		this.userNationalId = userNationalId;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
    
    
    
}
