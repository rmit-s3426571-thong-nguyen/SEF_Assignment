import java.util.Scanner;

public class Lecturer extends Staff {
	
	private String assignCourse;
	
	Scanner sc = new Scanner(System.in);
	Lecturer(String name, String username, String password, String rights, String assignCourse)
		{ 
			super(name,username,password,rights); 
			this.assignCourse = assignCourse;
		}
	
	public String getAssignCourse() {
		return assignCourse;
	}

	public void setAssignCourse(String assignCourse) {
		this.assignCourse = assignCourse;
	}


}
