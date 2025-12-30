package LW_05.Q2;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = 0;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int number) {
        this.numberOfStudentsEnrolled = number;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        if (lecturerInCharge != null) {
            System.out.println("Lecturer in Charge: " + lecturerInCharge.getName());
        }
        if (degreeBelongsTo != null) {
            System.out.println("Degree: " + degreeBelongsTo.getName());
        }
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge() {
        lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        degreeBelongsTo = null;
    }
}

