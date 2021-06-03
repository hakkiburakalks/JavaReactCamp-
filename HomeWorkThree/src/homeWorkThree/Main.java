package homeWorkThree;

public class Main {
          public static void main(String[] args) {
			
        	  Students student1 = new Students(20,"Burak", "Alkýþ", "20" ,"Java+React");
        	  WelcomeMessageMethod welcome1 = new WelcomeMessageMethod();
        	  Students student2 = new Students(23,"Yusuf", "Hatipoðlu", "21" ,"Python");
        	  WelcomeMessageMethod welcome2 = new WelcomeMessageMethod();
        	  Students student3 = new Students(25,"Yavuz", "Çaðrý", "26" ,"C#");
        	  WelcomeMessageMethod welcome3 = new WelcomeMessageMethod();
        	  
        	  //welcomeMassageMethod
        	  welcome1.welcomeMessageMethod(student1.name+" ",student1.surName);
        	  welcome2.welcomeMessageMethod(student2.name+" ",student2.surName);
        	  welcome3.welcomeMessageMethod(student3.name+" ",student3.surName);
        	 
        	  Students[] student = {student1,student2,student3};
        	  System.out.println("***********************************");
        	  
        	  for (Students studentswriting : student) {
        		  System.out.println(studentswriting.name);
        		  System.out.println(studentswriting.surName);
        		  System.out.println(studentswriting.ogrenciId);
        		  System.out.println(studentswriting.age);
        		  System.out.println(studentswriting.course);
				
			}
        	  System.out.println("*********************************");
        	  
        	  
        	  
        	Course course1 = new Course("Javascript Kursu",93,"Ahmet ------");
        	Course course2 = new Course("Angularjs",612,"Reyhan ------");  
        	Course course3 = new Course("CSS Kursu",93,"Levent ------");
        	
        	Course[] course = {course1,course2,course3};
        	
        	for (Course course4 : course) {
				System.out.println(course4.coursename);
				System.out.println(course4.courseId);
				System.out.println(course4.lecturerName);
				
			}
        	  
        	  
        	AddCourse addCourse = new AddCourse("Python");
        	  
        	
		}
}
