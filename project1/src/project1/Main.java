package project1;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		Student student1 = new Student(1, "Ali", "K�ro�lu", "1234");
		Student student2 = new Student(2, "Osman", "K�ro�lu", "1234");
		Instructor instructor = new Instructor(3,"Engin","Demiro�","3456");
		
		instructorManager.LogIn(instructor);
		studentManager.addHomework(student2);
		studentManager.addCourse(student1);
		
		
		

	}

}
