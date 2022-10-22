
import org.joda.time.DateTime;
import java.util.ArrayList;
import a.CourseProgramme;
import a.Student;
import a.Lecturer;
import a.Module;

public class Driver {
  public static void main(String[] args) 
  {

    // Create course objects and add to array list
    CourseProgramme course1 = new CourseProgramme("Chemistry", DateTime.parse("1987-06-03"), DateTime.parse("2022-09-10"));
    CourseProgramme course2 = new CourseProgramme("Maths Science", DateTime.parse("3456-11-01"), DateTime.parse("2654-09-11"));
    CourseProgramme course3 = new CourseProgramme("Biomedical Engineering", DateTime.parse("3071-04-5"), DateTime.parse("2073-01-19"));
    CourseProgramme course4 = new CourseProgramme("Computer Science and Information Technology", DateTime.parse("2134-06-10"), DateTime.parse("1204-12-14"));

     
    ArrayList<CourseProgramme> courseProgrammes = new ArrayList<>();
    courseProgrammes.add(course1);
    courseProgrammes.add(course2);
    courseProgrammes.add(course3);
    courseProgrammes.add(course4);

    // Create lecturers and Modules:
    Lecturer lecturer1 = new Lecturer("Steve Jobs", DateTime.parse("1955-04-12"), 57463287);
    Lecturer lecturer2 = new Lecturer("Mark Zuckerburg", DateTime.parse("2006-05-2"), 48393023);
    Lecturer lecturer3 = new Lecturer("Bill Gates", DateTime.parse("1987-06-19"), 67239912);
    Lecturer lecturer4 = new Lecturer("Elon Musk", DateTime.parse("1992-04-29"), 10592875);
    Lecturer lecturer5= new Lecturer("Kanye", DateTime.parse("1992-04-29"), 58498672);
    
    // Add a lecturer to each module
    Module module1 = new Module("Rings", "MA417", lecturer5);
    Module module2 = new Module("Measure Theory", "MA420", lecturer3);
    Module module3 = new Module("Groups", "MA319", lecturer1);
    Module module4 = new Module("Software Engineering III", "CT401", lecturer2);
    Module module5 = new Module("OSSE", "CT213X", lecturer2);
    Module module6 = new Module("Topology", "MA421", lecturer4);
    Module module7 = new Module("Differential forms", "MA233", lecturer5);
    

    // Creating students and adding to an array list:
    Student student1 = new Student("Joshua Cheptegei", DateTime.parse("1955-04-12"), 57683746);
    Student student2 = new Student("Eluid Kipchoge", DateTime.parse("1987-06-19"), 17502967);
    Student student3 = new Student("Marc Scott ", DateTime.parse("1973-10-11"), 18764027);
    Student student4 = new Student("Jake Weightman", DateTime.parse("2006-05-2"), 58837716);
    Student student5 = new Student("Jakob Ingebristen", DateTime.parse("1994-01-01"), 11094621);
    Student student6 = new Student("Jacob Kiplimo", DateTime.parse("1992-04-29"), 90483302);
    
    
    ArrayList<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);

    

    

    // For each student add a course they are taking and modules chosen
    student1.addCourse(course1);
    student1.addModule(module2);
    student1.addModule(module4);
    student1.addModule(module5);
    student1.addModule(module6);

    student2.addCourse(course2);
    student2.addModule(module2);
    student2.addModule(module3);

    student3.addCourse(course3);
    student3.addModule(module7);
    student3.addModule(module5);
    student3.addModule(module2);

    student4.addCourse(course4);
    student4.addModule(module7);
    student4.addModule(module6);
    student4.addModule(module5);
    student4.addModule(module4);

    student5.addCourse(course3);
    student5.addModule(module1);
    student5.addModule(module2);

    student6.addCourse(course2);
    student6.addModule(module2);
    student6.addModule(module5);
    student6.addModule(module7);

    // Add module choices to courses.
    course1.addModule(module7);
    course1.addModule(module4);
    course2.addModule(module3);
    course2.addModule(module4);
    course2.addModule(module5);
    course2.addModule(module6);
    course3.addModule(module1);
    course3.addModule(module2);
    course3.addModule(module3);
    course4.addModule(module1);
    course4.addModule(module2);
    

    // Print information about students and the course programme:
    System.out.println("List of Students: \n");
    for (Student student : students) {
      System.out.println(student.toString());
    }

    
    System.out.println("List of Courses: ");
    for (CourseProgramme course : courseProgrammes) {
      System.out.println(course.toString());
    }
  }
}
