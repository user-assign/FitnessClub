import org.junit.Test;
import static org.junit.Assert.*;

public class AllClassesTest {
    
    @Test
    public void testAllClasses() {
        // The below code is to 
        Person p1 = new Person("John", "Doe");
        assertEquals("John", p1.getFirstName());
        assertEquals("Doe", p1.getLastName());
        
        // Test the Student class
        Student s1 = new Student("Jane", "Smith", "12345");
        assertEquals("Jane", s1.getFirstName());
        assertEquals("Smith", s1.getLastName());
        assertEquals("12345", s1.getStudentId());
        
        // Test the Teacher class
        Teacher t1 = new Teacher("Bob", "Jones", "Math");
        assertEquals("Bob", t1.getFirstName());
        assertEquals("Jones", t1.getLastName());
        assertEquals("Math", t1.getSubject());
        
        // Test the Course class
        Course c1 = new Course("Intro to Programming", t1);
        assertEquals("Intro to Programming", c1.getName());
        assertEquals(t1, c1.getInstructor());
        
        // Test the Enrollment class
        Enrollment e1 = new Enrollment(s1, c1);
        assertEquals(s1, e1.getStudent());
        assertEquals(c1, e1.getCourse());
        
        // Test the School class
        School school = new School();
        school.addPerson(p1);
        school.addPerson(s1);
        school.addPerson(t1);
        school.addCourse(c1);
        school.addEnrollment(e1);
        
        assertTrue(school.getPeople().contains(p1));
        assertTrue(school.getPeople().contains(s1));
        assertTrue(school.getPeople().contains(t1));
        assertTrue(school.getCourses().contains(c1));
        assertTrue(school.getEnrollments().contains(e1));
    }
}
