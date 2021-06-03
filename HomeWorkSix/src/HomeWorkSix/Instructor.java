package HomeWorkSix;

public class Instructor extends User {
	private String detail;
	private int salary;
	private String instructorOfCourse;
	public Instructor() {
		
	}

	public Instructor(String id, String name, String surName, String email, String password, String phoneNumber,
			String nationalIdenity, String detail, int salary, String instructorOfCourse) {
		super(id, name, surName, email, password, phoneNumber, nationalIdenity);
		this.detail = detail;
		this.salary = salary;
		this.instructorOfCourse = instructorOfCourse;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getInstructorOfCourse() {
		return instructorOfCourse;
	}

	public void setInstructorOfCourse(String instructorOfCourse) {
		this.instructorOfCourse = instructorOfCourse;
	}
	
}
