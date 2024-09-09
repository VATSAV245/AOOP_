package com.example.sis;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<IStudent> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void addStudent(IStudent student) {
        students.add(student);
    }

    @Override
    public void removeStudent(IStudent student) {
        students.remove(student);
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return students;
    }
}
