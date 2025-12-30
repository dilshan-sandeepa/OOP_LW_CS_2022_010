package LW_05.Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Department softwareDept = new Department("Software Engineering");

        Degree csDegree = new Degree("Computer Science");

        Course oopCourse = new Course("Object-Oriented Programming", "Core");
        Course dbCourse = new Course("Database Systems", "Core");

        csDegree.offerCourse(oopCourse);
        csDegree.offerCourse(dbCourse);

        softwareDept.offerCourse(oopCourse);
        softwareDept.offerCourse(dbCourse);

        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Professor", softwareDept);
        Lecturer lecturer2 = new Lecturer("Dr. Johnson", "Senior Lecturer", softwareDept);

        softwareDept.appointDepartmentHead(lecturer1);

        softwareDept.addLecturer(lecturer1);
        softwareDept.addLecturer(lecturer2);

        oopCourse.addLecturerInCharge(lecturer1);
        dbCourse.addLecturerInCharge(lecturer2);

        lecturer1.addCourse(oopCourse);
        lecturer2.addCourse(dbCourse);

        Student student1 = new Student("Alice", "S1001", "1st Year", csDegree);
        Student student2 = new Student("Bob", "S1002", "2nd Year", csDegree);

        student1.enrollCourse(oopCourse);
        student1.enrollCourse(dbCourse);
        student2.enrollCourse(oopCourse);

        // display the all information
        System.out.println("=== DEPARTMENT INFO ===");
        softwareDept.displayInfo();

        System.out.println("\n=== DEGREE INFO ===");
        csDegree.displayInfo();

        System.out.println("\n=== COURSE INFO ===");
        oopCourse.displayInfo();
        System.out.println();
        dbCourse.displayInfo();

        System.out.println("\n=== LECTURER INFO ===");
        lecturer1.displayInfo();
        System.out.println();
        lecturer2.displayInfo();

        System.out.println("\n=== STUDENT INFO ===");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
