package HomeWorkSix;

public class StudentManager {

	public void joinCourse(String coursename) {
		System.out.println(coursename+" adlý kursa katýlmýþtýr");
	}
	public void deleteCourse(String coursename) {
		System.out.println(coursename+" adlý kurs silinmiþtir");
	}
	public void showUserInformation(Student student) {
		System.out.println("Ad:"+student.getName()+"Soyad:"+student.getSurName());
	}

}
