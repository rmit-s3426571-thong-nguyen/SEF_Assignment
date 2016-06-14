import java.util.ArrayList;
import java.util.Scanner;

public class CourseManagementSystem {
	private ArrayList<String> date = new ArrayList<>();
	private ArrayList<Student> std = new ArrayList<Student>();
	private ArrayList<Staff> stf = new ArrayList<Staff>();
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Results> result = new ArrayList<Results>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<CourseOffers> courseOffers = new ArrayList<CourseOffers>();
	private ArrayList<String> prerequisites = new ArrayList<>();
	
	private Staff staff;
	private Lecturer lec;
	private Course course;
	private CourseOffers courseOff;
	private Student student;
	
	public static void main(String[] args) {
		CourseManagementSystem start = new CourseManagementSystem();
		start.menuMain();
	}
	

	//--------------------MENUS---------------------//
	
	//main student and staff login menu
	public String printMenu(){
		System.out.println("Course Management System");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("1) Student Login");
		System.out.println("2) Staff Login");
		System.out.println("3) Exit");
		System.out.println("");
		System.out.println("-----------------------------");
		
		//scan the user input
		System.out.println("Enter your selection: ");
	    String userInput = sc.nextLine();
		
		return userInput;
	}
	
	public void menuMain(){
		String userInput;
		char option = '\0';
		do
		{	
			userInput = printMenu();
			//validation for userInput
			if(userInput.length() != 1){
				System.out.println("Invalid Input");
			}else{
				option = Character.toUpperCase(userInput.charAt(0));
                switch (option)
                {
                    case '1':
                    	studentLogin();
                        break;
                        
                    case '2':
                    	staffLogin();
                        break;
                        
                    case '3':
                        System.out.println("Exiting System! goodbye!");
                        break;

                    default:
                        //default case - handles invalid selections 
                        System.out.println("Error - invalid selection!");
                }
            }
            System.out.println();
		}while(option != '3');
	}

	public String printMenuStudent(){
		System.out.println("\nStudent Menu");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("1) Search for course");
		System.out.println("2) View course details");
		System.out.println("3) Enrol to a course");
		System.out.println("4) View Enrolment Summary");
		System.out.println("5) Return to main menu");
		System.out.println("");
		System.out.println("-----------------------------");
		
		//scan the user input
		System.out.println("Enter your selection: ");
	    String userInput = sc.nextLine();
		
		return userInput;
	
	}
	
	//student menu
	public void menuStudent(){
		String userInput;
		char option = '\0';
		do
		{	
			userInput = printMenuStudent();
			//validation for userInput
			if(userInput.length() != 1){
				System.out.println("Invalid Input");
			}else{
				option = Character.toUpperCase(userInput.charAt(0));
                switch (option)
                {
                    case '1':
                    	searchCourse();
                        break;
                        
                    case '2':
                    	printDetail();
                    	break;
                        
                    case '3':
                    	searchCourseFromStudent();
                        break;
                        
                    case '4':
                    	viewEnrolledCourses();
                    	break;

                    case '5':
                    	System.out.println("Exiting System! goodbye!");
                    	break;
                    	
                    default:
                        //default case - handles invalid selections 
                        System.out.println("Error - invalid selection!");
                }
            }
            System.out.println();
		}while(option != '5');
	}

	public String printMenuProgCord(){
		System.out.println("\nProgram Coordinator Menu");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("1) Accept course offer");
		System.out.println("2) Add course Details");
		System.out.println("3) Grant special permission");	
		System.out.println("4) Grant excemption");	
		System.out.println("5) Confirm Enrollment");
		System.out.println("6) Confirm Withdrawal");
		System.out.println("7) Return to main menu");
		System.out.println("");
		System.out.println("-----------------------------");
		
		//scan the user input
		System.out.println("Enter your selection: ");
	    String userInput = sc.nextLine();
		
		return userInput;
	
	}
	
	//program coordinator menu
	public void menuProgCord(){
		String userInput;
		char option = '\0';
		do
		{	
			userInput = printMenuProgCord();
			//validation for userInput
			if(userInput.length() != 1){
				System.out.println("Invalid Input");
			}else{
				option = Character.toUpperCase(userInput.charAt(0));
                switch (option)
                {
                    case '1':
                        break;
                        
                    case '2': addCourseDetails();
                    	break;
                        
                    case '3':
                        break;
                        
                    case '4':
                    	break;
                    	
                    case '5':
                    	break;
                    	
                    case '6':
                    	break;
                        
                    case '7':
                    	System.out.println("Return to main menu");
                    	break;
                    	
                    default:
                        //default case - handles invalid selections 
                        System.out.println("Error - invalid selection!");
                }
            }
            System.out.println();
		}while(option != '8');
	}
	
	public String printMenuLecturer(){
		System.out.println("\nLecturer Menu");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("1) Upload Results");
		System.out.println("2) View Past Performance");
		System.out.println("3) Return to main menu");
		System.out.println("");
		System.out.println("-----------------------------");
		
		//scan the user input
		System.out.println("Enter your selection: ");
	    String userInput = sc.nextLine();
		
		return userInput;
	
	}
	
	//lecturer menu
	public void menuLecturer(){
		String userInput;
		char option = '\0';
		do
		{	
			userInput = printMenuLecturer();
			//validation for userInput
			if(userInput.length() != 1){
				System.out.println("Invalid Input");
			}else{
				option = Character.toUpperCase(userInput.charAt(0));
                switch (option)
                {
                    case '1': uploadResults();
                        break;
                        
                    case '2': viewPastPerformance();
                    	break;
                        
                    case '3':
                        System.out.println("Return to main menu");
                        break;

                    default:
                        //default case - handles invalid selections 
                        System.out.println("Error - invalid selection!");
                }
            }
            System.out.println();
		}while(option != '3');
	}

	public String printMenuAdmin(){
		System.out.println("\nAdmin Menu");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("1) Assign Lecturer");
		System.out.println("2) Add course offer");
		System.out.println("3) View courses offer");
		System.out.println("4) Search course offer");
		System.out.println("5) View past performance");
		System.out.println("6) View Enrolled Students");
		System.out.println("7) Return to main menu");
		System.out.println("");
		System.out.println("-----------------------------");
		//scan the user input
		System.out.println("Enter your selection: ");
	    String userInput = sc.nextLine();
		return userInput;
	}
	
	//admin menu
	public void menuAdmin(){
		String userInput;
		char option = '\0';
		do
		{	
			userInput = printMenuAdmin();
			//validation for userInput
			if(userInput.length() != 1){
				System.out.println("Invalid Input");
			}else{
				option = Character.toUpperCase(userInput.charAt(0));
                switch (option)
                {
                    case '1': assignLecturer();
                        break;
                        
                    case '2': addCourseOffer();
                    	break;
                        
                    case '3': viewCourseOffer();
                        break;
                        
                    case '4': searchCourseOffer();
                    	break;
                    	
                    case '5': viewPastPerformance();
                    	break;
                    	
                    case '6': checkEnrolledStudent();
                    	break;
                    	
                    case '7':
                    	System.out.println("Return to main menu");
                    	break;
                    	
                    default:
                        //default case - handles invalid selections 
                        System.out.println("Error - invalid selection!");
                }
            }
            System.out.println();
		}while(option != '6');
	}
	
	//--------------------MENUS---------------------//

	
	//student login menu - validate if student
	public void studentLogin(){
		System.out.println("Username: ");
		String un = sc.nextLine();
		System.out.println("Password: ");
		String pw = sc.nextLine();
		int i;
		
		for (i = 0; i < std.size(); i++)
		{
			if (std.get(i).getUsername().compareTo(un)==0 &&
					std.get(i).getPassword().compareTo(pw)==0)
			{
				student = std.get(i);
				System.out.println("Welcome " + student.getName() + "\nAccess Rights: " + student.getClass());
				//checks if student and prompts to menu
				if (student.getRights() == "Student")
					menuStudent();
				break;
			}
		}
		if (i == std.size())
		{
			System.out.println("Invalid username or password");
			System.out.println("Press enter to continue");
			sc.nextLine();
		}
	}
	
	//staff login menu - validate if Admin, Lec or PC
	public void staffLogin(){
		System.out.println("Username: ");
		String un = sc.nextLine();
		System.out.println("Password: ");
		String pw = sc.nextLine();
		int i;
	
		for (i = 0; i < stf.size(); i++)
		{
			if (stf.get(i).getUsername().compareTo(un)==0 &&
					stf.get(i).getPassword().compareTo(pw)==0)
			{
				staff = stf.get(i);
				System.out.println("Welcome " + staff.getName() + "\nAccess Rights: " + staff.getClass());
				//checks for which type of user and prompts to menu
				if (staff.getRights() == "Admin")
					menuAdmin();
				if (staff.getRights() == "Lecturer")
					menuLecturer();
				if (staff.getRights() == "ProgramCoordinator")
					menuProgCord();
				break;
			}
		}
		if (i == stf.size())
		{
			System.out.println("Invalid username or password");
			System.out.println("Press enter to continue");
			sc.nextLine();
		}
	}

	
	
	//--------------------COURSE--------------------//
	
	
	public boolean haveTakenPrerequisite(Course course) {
		ArrayList<String> prerequisites = course.getPrerequisites();
		
		if(prerequisites == null || prerequisites.size() == 0)
		{
			return true;
		}
		for (String p : prerequisites) {
			
		}
		
		return true;
	}
	
	public Course findCourse(String courseInput){
		Course c = null;
		for ( Course co : courses) {
			if((co.courseID.contains(courseInput)) || co.courseName.contains(courseInput)){
				c = co;
			}
		}
		return c;
	}
	
	public void addCourse(){
		String courseID, courseName;
		
		System.out.print("Enter Course ID: ");
		courseID = sc.nextLine();
		course.setCourseID(courseID);
		
		System.out.print("Enter Course Name: ");
		courseName = sc.nextLine();
		course.setCourseName(courseName);
		
		//Should be an array for prerequisites
		System.out.print("Enter prerequisites: ");
		prerequisites.add(sc.nextLine());
		
		course.setPrerequisites(prerequisites);
		
		System.out.println("Press Enter to continue");
		sc.nextLine();
		
		
		courses.add(new Course(courseID, courseName, prerequisites));
		
		System.out.println("Successfuly added new course " + courseName +
					" with courseID - " + courseID);
	}
	
	public void searchCourse(){
		//use get methods instead
		String courseInput;
		System.out.println("Enter CourseID or Course Name you want to search : ");
	    courseInput = sc.nextLine();
		for ( Course co : courses) {
			if(co.courseID.contains(courseInput) || co.courseName.contains(courseInput)){
				System.out.println("Course found: " + co.getCourseID()
		        + " [" + co.getCourseName() + "]");
				return ;
			}
		}
		System.out.println("Invalid Input");
	}
	
	public void viewCourses(){
		for (Course course : courses) {
			System.out.println(course);
		}
	}
	public void checkEnrolledStudent(){
		for (Course course : courses) {
			System.out.println(course);
			System.out.println(course.getEnrolledStudent());
		}
	}
	
	public void printDetail() {
		//use get methods instead
		System.out.printf("%s %s\n", "Course ID: ", course.courseID);
    	System.out.printf("%s %s\n", "Course Name: ", course.courseName);
	}
	
	//--------------------COURSE--------------------//
	
	//--------------------STUDENT-------------------//
	public void searchCourseFromStudent(){
		//use get methods instead
		String courseInput;
		Course course;
		System.out.println("Enter CourseID or Course Name you want to enrol : ");
	    courseInput = sc.nextLine();
	    
	    course = findCourse(courseInput);
	    
	    if(course != null){
	    	course.addStudentsToCourse(student);
	    	student.enrolCoursestoStudent(course);
	    }else{
	    	System.out.println("Invalid Input");
	    }
	}
	public void viewEnrolledCourses(){
		for (Student student : std) {
			System.out.printf("Courses you have enrolled : " + student.getEnrolledCourse());
		}
	}
	
	//--------------------ADMIN---------------------//
	
	public void assignLecturer()
	{
		System.out.println("Enter a Lecturer ID: ");
		String lecID = sc.nextLine();
		int i;
		for (i = 0; i < stf.size(); i++)
		{
			if (stf.get(i).getUsername().compareTo(lecID)==0)
			{	
				System.out.println("Enter the course to assign to this lecturer: ");
				String assCourse = sc.nextLine();
				for (i = 0; i < stf.size(); i++)
				{
					lec.setAssignCourse(assCourse);
				}
			}
			else
				System.out.println("Invalid ID");
		}
	}
	
	public String addCourseOffer()
	{
		int i;
		System.out.println("Enter the course offer name: ");
		String courseOfferName = sc.nextLine();
		System.out.println("Enter the course offer ID");
		String courseOfferID = sc.nextLine();
		System.out.println("Enter the course prerequisites");
		String courseOfferPrereq = sc.nextLine();
		for(CourseOffers courseOffer: courseOffers)
		{
			if(courseOffer.getCourseName().equals(courseOffers))
			{
				System.out.println("course already exists");
				return "";
			}
		}
		courseOffers.add(new CourseOffers("", courseOfferName, new ArrayList<String>()));
		System.out.println("Course has been added to offer list.");
		
		return courseOfferName;
	}
	
	public void addCourseDetails(){
		System.out.println("Enter course prequisites");
		String Input = sc.next();
		prerequisites.add(Input);
		System.out.println("Please enter the date in this format dd/MM/yyyy ");
		String dateInput = sc.next();
		date.add(dateInput);
		System.out.println("Information saved: " + prerequisites + "date saved: " + date );
		
	}
	public void viewCourseOffer()
	{
		int i;
		for(i = 0; i < courseOffers.size(); i++)
		{
			System.out.println("Course (" + i + ") : " + courseOffers.get(i).getCourseName() + "\n");
		}
	}
	
	public void searchCourseOffer()
	{
		String courseInput;
		System.out.println("Enter CourseID or Course Name you want to search : ");
	    courseInput = sc.nextLine();
		for ( Course co : courses) {
			if(co.courseID.contains(courseInput) || co.courseName.contains(courseInput)){
				System.out.println("Course found: " + co.getCourseID()
		        + " [" + co.getCourseName() + "]");
				return ;
			}
		}
		System.out.println("Invalid Input");
		
	}
	
	public void viewPastPerformance()
	{
		System.out.println("Enter the student ID: ");
		String stdID = sc.nextLine();
		System.out.println("Enter the student's course ID: ");
		String stdCourse = sc.nextLine();
		int i;
		for (i = 0; i < std.size(); i++)
		{
			if (std.get(i).getUsername().compareTo(stdID)==0)
			{
				for (i = 0; i < courses.size(); i++)
				{
					if (courses.get(i).getCourseID().compareTo(stdCourse)==0)
					{
						System.out.println("Student results: " + std.get(i).getResults());
					}
					else
						System.out.println("Course does not exist");
				}
			}
			else
				System.out.println("Invalid username");
		}
		
	}
	
	//--------------------LECTURER------------------//
	public void uploadResults()
	{
		System.out.println("Enter the student ID: ");
		String stdID = sc.nextLine();
		
		int i;
				
		for (i = 0; i < std.size(); i++)
		{
			if (std.get(i).getUsername().compareTo(stdID)==0)
			{
				System.out.println("Enter the course of the Student: ");
				String stdCourse = sc.nextLine();
				
				for (i = 0; i < courses.size(); i++)
				{
					if (courses.get(i).getCourseID().compareTo(stdCourse)==0)
					{
						System.out.println("Enter results for student: ");
						String stdResults = sc.nextLine();
						
						std.get(i).setResults(stdResults);
					}
					else
						System.out.println("Course does not exist");
				}
			}
			else
				System.out.println("Invalid username");
		}
	}
	
	//instances
	CourseManagementSystem()
	{
		ArrayList<String> iosPrereqs = new ArrayList<String>();
		iosPrereqs.add("Advanced Programming Language");
		iosPrereqs.add("Introduction to Programming");
		courses.add(new Course("COSC2471", "iPhone Software Engineering",iosPrereqs));
		
		//courses.add(new Course("COSC2472", "Advanced Programming Language", "Prereq"));
		
		stf.add(new Lecturer("John Snow","John","123","Lecturer", "Assigned Course"));
		stf.add(new ProgramCoordinator("James Huang","James","123","ProgramCoordinator"));
		stf.add(new Admin("Tom Nguyen","Tom","123","Admin"));
		std.add(new Student("100","Steph Curry","Curry","123","Student", "Empty"));
	}
}

