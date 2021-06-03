package CofeeShop;

import java.time.LocalDate;

public class Customer implements Entities {
public int id;
public String firstName;
public String surname;	
private LocalDate dateOfBirth;

public String nationalityId;

public Customer(int id, String firstName, String surname, LocalDate dateOfBirth, String nationalityId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.surname = surname;
    this.dateOfBirth = dateOfBirth;
	this.nationalityId = nationalityId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}


public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}
	
}
