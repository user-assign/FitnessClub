import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FitnessClubTest {
    
    @Test
    public void testMakeBooking() {
        FitnessClub club = new FitnessClub();
        boolean result = club.makeBooking("Spin", "Saturday");
        assertTrue(result);
        result = club.makeBooking("Yoga", "Sunday");
        assertTrue(result);
        result = club.makeBooking("Spin", "Saturday");
        assertTrue(result);
        result = club.makeBooking("Yoga", "Sunday");
        assertTrue(result);
        result = club.makeBooking("Zumba", "Saturday");
        assertFalse(result);
    }
    
    @Test
    public void testFitnessLesson() {
        FitnessLesson lesson = new FitnessLesson("Spin", "Saturday", 5, 10.0);
        assertEquals("Spin", lesson.getName());
        assertEquals("Saturday", lesson.getDay());
        assertEquals(5, lesson.getMaxCapacity());
        assertEquals(0, lesson.getNumBookings());
        assertEquals(10.0, lesson.getPrice(), 0.001);
        
        lesson.incrementNumBookings();
        assertEquals(1, lesson.getNumBookings());
        assertFalse(lesson.isFull());
        
        for (int i = 0; i < 5; i++) {
            lesson.incrementNumBookings();
        }
        assertTrue(lesson.isFull());
    }
    
    @Test
    public void testMain() {
        // Mock user input for testing
        String input = "1\n2\nSpin\nSaturday\n3\n4\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        // Call main method
        Main.main(new String[0]);
        
        // Reset System.in to standard input stream
        System.setIn(System.in);
    }
}
