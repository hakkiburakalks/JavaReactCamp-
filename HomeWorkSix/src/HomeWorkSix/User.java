package HomeWorkSix;

public class User {
	private String id;
	private String name;
	private String surName;
	private String email;
	private String password;
	private String phoneNumber;
	private String nationalIdenity;
	
	public User() {
		
	}
	
	public User(String id, String name, String surName, String email, String password, String phoneNumber,String nationalIdenity) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.nationalIdenity = nationalIdenity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationalIdenity() {
		return nationalIdenity;
	}
	public void setNationalIdenity(String nationalIdenity) {
		this.nationalIdenity = nationalIdenity;
	}

}
