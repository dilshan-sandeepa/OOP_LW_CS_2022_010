package LW_03.Q4;

public class Main {
    public static void main(String[] args) {
        // Lecturer ob
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Computer Science");

        // Course object
        Course course1 = new Course("Introduction to Programming", "CS101", lecturer1);

        //Student object
        Student student1 = new Student("Alice Johnson", "Computer Science", course1.getCourseName());

        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Course Code: " + course1.getCourseCode());
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
    }
}

