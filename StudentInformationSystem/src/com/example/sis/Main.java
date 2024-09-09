package com.example.sis;

public class Main {
    public static void main(String[] args) {
        IStudent student1 = new Student("1", "Harsha");
        IStudent student2 = new Student("2", "Varshith");

        ICourse course1 = new Course("C1", "Math");
        ICourse course2 = new Course("C2", "Science");

        EnrollmentManager enrollmentManager = new EnrollmentManager();

        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student1, course2);
        enrollmentManager.enrollStudentInCourse(student2, course1);

        System.out.println("Students in Math (Course ID: " + course1.getCourseId() + "):");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }

        System.out.println("\nStudents in Science (Course ID: " + course2.getCourseId() + "):");
        for (IStudent student : course2.getEnrolledStudents()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
