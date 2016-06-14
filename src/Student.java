import java.util.ArrayList;

public class Student {
	private ArrayList<Course> studentCourses = new ArrayList<Course>();
	private String results;
	private String name;
	private String studentID;
	private String username;
	private String password;
	private String rights;
	
	
	public Student(String studentID,String name, String username, String password, String rights, String results)
	{
		this.results = results;
		this.studentID = studentID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.rights = rights;
	}
	
	public String getResults() {
		return results;
	}
	
	public void setResults(String results) {
		this.results = results;
	}
	
	//getters
	public String getStudentID(){
		return studentID;
	}
	public ArrayList<Course> getEnrolledCourse(){
		return studentCourses;
	}
	public String getName(){ return name; }
	public String getUsername(){ return username; }
	public String getPassword(){ return password; }
	public String getRights(){ return rights; }
	
	
	public boolean enrolCoursestoStudent(Course newCourse){
		for (Course course : studentCourses) {
			if(course.getCourseID() == newCourse.getCourseID()){
				System.out.println("You already added this course");
				return false;
			}
		}
		studentCourses.add(newCourse);
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentID +" "+ name;
	}

}
