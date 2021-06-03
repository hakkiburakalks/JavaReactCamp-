package HomeWorkSix;

public class Main {
	public static void main(String[] args) {
		Instructor engindemirog = new Instructor();
		engindemirog.setName("Engin");
		engindemirog.setSurName("Demiroð");
		engindemirog.setId("313131");
		engindemirog.setPassword("xxxxxxxxxxxx");
		engindemirog.setEmail("engþndemirog@gmail.com");
		engindemirog.setNationalIdenity("11414144141");
		engindemirog.setPhoneNumber("555555555555");
		engindemirog.setInstructorOfCourse("Java");
		engindemirog.setSalary(1000000);
		
		Student burakalkis = new Student();
		burakalkis.setName("Burak");
		burakalkis.setSurName("Alkýþ");
		burakalkis.setCourseId("13");
		burakalkis.setCreditCardNumber("1111111111111111");
		burakalkis.setNationalIdenity("111111111111111111");
		burakalkis.setRegisteredCourses("Java");
		burakalkis.setPassword("xxxxxxxxx");
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(burakalkis);
		instructorManager.addCourses("Python");
		
		User[]users = {engindemirog,burakalkis};
		for (User usersarray : users) {
			System.out.println(usersarray.getName());
			System.out.println(usersarray.getEmail());
			System.out.println(usersarray.getSurName());
			System.out.println(usersarray.getPhoneNumber());
			System.out.println(usersarray.getId());
		
		}
		
		
	}

}
