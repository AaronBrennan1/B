import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;
import a.Student;
import a.Lecturer;
public class QuickTest 
{
  @Test void testStudentInfo() {
		try {
			Student a = new Student("Leo Varadkar", DateTime.parse("1979-01-18"), 12345678);

			assertEquals(a.getName(), "Leo Varadkar");
			assertEquals(a.getDateOfBirth(), DateTime.parse("1979-01-18"));
			assertEquals(a.getId(), 12345678);
            assertEquals(a.getAge(), 43);
            
            // TESTING USERNAME
            assertEquals(a.getUsername(), "LeoVaradkar43");
			
		} catch(Exception e) {
			assertTrue(false);
		}
	}

  @Test void testLecturerInfo() {
		try {
			Lecturer l = new Lecturer("Tobias Rossman", DateTime.parse("1985-02-05"), 25678934);

			assertEquals(l.getName(), "Tobias Rossman");
			assertEquals(l.getDateOfBirth(), DateTime.parse("1985-02-05"));
			assertEquals(l.getId(), 25678934);
            assertEquals(l.getAge(), 37);
            
            // TESTING USERNAME
            assertEquals(l.getUsername(), "TobiasRossman37");
			
		} catch(Exception e) {
			assertTrue(false);
		}
  }
}