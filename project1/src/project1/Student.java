package project1;

public class Student extends User {

	public Student(int id, String firstName, String lastName, String password) {
		super(id, firstName, lastName, password);
		
	}
	
	private String homeworks[];
	private String courses[];
	private String completedCourses[];
	private String completedHomeworks[];
	
	public String[] getCompletedCourses() {
		return completedCourses;
	}

	public void setCompletedCourses(String completedCourses[]) {
		this.completedCourses = completedCourses;
	}

	
	private String[] getCompletedHomeworks() {
		return completedHomeworks;
	}

	private void setCompletedHomeworks(String completedHomeworks[]) {
		this.completedHomeworks = completedHomeworks;
	}

	private String[] getHomeworks() {
		return homeworks;
	}

	private void setHomeworks(String homeworks[]) {
		this.homeworks = homeworks;
	}

	private String[] getCourses() {
		return courses;
	}

	private void setCourses(String courses[]) {
		this.courses = courses;
	}

	
	
	

}
