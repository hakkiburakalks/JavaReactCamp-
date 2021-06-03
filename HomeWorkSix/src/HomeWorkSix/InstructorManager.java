package HomeWorkSix;

public class InstructorManager extends UserManager{
	public void addCourses(String coursename) {
		System.out.println(coursename+" adlý kurs eklenmiþtir");
	}
	public void deleteCourse(String coursename) {
		System.out.println(coursename+"adlý kurs silinmiþtir");
	}
	
	public void showUserInformation(Instructor instructor) {
		System.out.println("Ad:"+instructor.getName()+"Soyad:"+instructor.getSurName());
	}

}
