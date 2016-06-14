import java.util.ArrayList;

public class CourseOffers {
	public String courseID;
	public String courseName;
	public ArrayList<Student> students = new ArrayList<Student>();
	public ArrayList<String> prerequisites;

	public CourseOffers(String courseID, String courseName, ArrayList<String> prerequisites) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.prerequisites = prerequisites;
	}

	public String getCourseID() {
		return courseID;
	}
	
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<String> getPrerequisites() {
		return prerequisites;
	}
	
	public void setPrerequisites(ArrayList<String> prerequisites) {
		this.prerequisites = prerequisites;
	}
	public ArrayList<Student> getEnrolledStudent() {
		return students;
	}
	
	public boolean addStudents(Student newStudent){
		for (Student student : students) {
			if(student.getStudentID() == newStudent.getStudentID()){
				System.out.println("This student is already enrolled man!");
				return false;
			}
		}
		students.add(newStudent);
		return true;
	}
	public String toString(){
		 return courseID + " " + courseName;
	}
}
