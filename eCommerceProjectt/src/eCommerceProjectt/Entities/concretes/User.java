package eCommerceProjectt.Entities.concretes;

import java.text.BreakIterator;

import eCommerceProjectt.Entities.abstracts.Entity;

public class User implements Entity {

	private String name;
	private String surName;
	private String mail;
	private String password;
	public User() {
		
	}
	public User(String name, String surName, String mail, String password) {
		
		this.name = name;
		this.surName = surName;
		this.mail = mail;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2) {
			System.out.println("Ýsminiz en az 2 karakterden oluþmalýdýr.");
			return
		}
		else {
			this.name = name;
		}
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		if(surName.length()<2) {
			System.out.println("Soyadýnýz en az 2 karakterden oluþmalýdýr");
			return;
		}
		else {
			this.surName = surName;
		}
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length()<6) {
			System.out.println("Parolanýz en az 6 karakterden oluþmaktadýr");
		     return;
			
		}
	
		else {
			this.password = password;
		}
	
	
	
	
	
	
	
	}}
