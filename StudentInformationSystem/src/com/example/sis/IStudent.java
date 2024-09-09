package com.example.sis;

public interface IStudent {
	String getId();
    String getName();
    void enrollInCourse(ICourse course);
    void removeFromCourse(ICourse course);
}
