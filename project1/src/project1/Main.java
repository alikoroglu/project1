package project1;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		Student student1 = new Student(1, "Ali", "Köroğlu", "1234");
		Student student2 = new Student(2, "Osman", "Köroğlu", "1234");
		Instructor instructor = new Instructor(3,"Engin","Demiroğ","3456");
		
		instructorManager.LogIn(instructor);
		studentManager.addHomework(student2);
		studentManager.addCourse(student1);
		
		
		

	}

}
