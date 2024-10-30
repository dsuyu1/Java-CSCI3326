// Import the Student class
import school.*; 

public class Main {

    public static void main(String[] args) throws Exception {
        // Assign a value to school_id without creating on object.
        Student.school_id = 144;

        // Create 3 Student objects with unique name and id.
        Student John = new Student("John", "john@utrgv.edu");
        Student Jill = new Student("Jill", "jill@utrgv.edu");
        Student Jack = new Student("Jack", "jack@utrgv.edu");

        // Output the student information using studentInfo()
        John.studentInfo();
        Jill.studentInfo();
        Jack.studentInfo();

        // Update the school_id
        Student.school_id = 999;

        // Output the student information again to confirm change.
        John.studentInfo();
        Jill.studentInfo();
        Jack.studentInfo();
        
    }
}