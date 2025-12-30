package LW_05.Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Department: " + name);
        displayDepartmentHeadInfo();
        System.out.println("Courses Offered:");
        for (Course c : coursesOffering) {
            System.out.println("- " + c.getName());
        }
        System.out.println("Lecturers in Department:");
        for (Lecturer l : lecturersBelongsTo) {
            System.out.println("- " + l.getName());
        }
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("Department Head: None");
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}

