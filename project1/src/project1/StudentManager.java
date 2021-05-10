package project1;

public class StudentManager extends UserManager{
	
	public void addHomework(Student student) {
		System.out.println(student.getFirstName()+" ödeviniz eklendi");
	}
	
	public void addCourse(Student student) {
		System.out.println(student.getFirstName()+" kursunuz eklendi");
	}
	

}
