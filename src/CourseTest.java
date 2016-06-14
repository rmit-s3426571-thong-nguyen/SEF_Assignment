//
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//
//
//
//public class CourseTest {
//	Course course;
//	@Before
//	public void setUp() {
//	
//		course = new Course("COSC2016","APT","Advanded Programming");
//	
//	}
//	@After
//	public void tearDown() {
//		
//	}
//	
//	@Test
//	public void tesFindCourse(){
//		assertEquals(course.getCourseID(),Course.findCourse("COSC2016").getCourseID());;
//	}
//	
//	@Test
//	public void testAddCourse(){
//		course.addCourse();	
//		
//		assertEquals("COSC2015", Course.findCourse("COSC2015").getCourseID());
//	}
//
//}
