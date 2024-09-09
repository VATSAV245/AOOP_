package com.example.sis;

public class EnrollmentManager {
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
    }

    public void removeStudentFromCourse(IStudent student, ICourse course) {
        student.removeFromCourse(course);
    }
}
