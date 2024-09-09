package com.example.sis;

import java.util.List;

public interface ICourse {
    String getCourseId();
    String getCourseName();
    void addStudent(IStudent student);
    void removeStudent(IStudent student);
    List<IStudent> getEnrolledStudents(); // Added this method
}
