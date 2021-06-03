package HomeWorkSix;

public class Student extends User {

	private String courseId;
	private String creditCardNumber;
	private String registeredCourses;
	
	public Student() {
		
	}
	public Student(String id, String name, String surName, String email, String password, String phoneNumber,
			String nationalIdenity, String courseId, String creditCardNumber, String registeredCourses) {
		super(id, name, surName, email, password, phoneNumber, nationalIdenity);
		this.courseId = courseId;
		this.creditCardNumber = creditCardNumber;
		this.registeredCourses = registeredCourses;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
}
