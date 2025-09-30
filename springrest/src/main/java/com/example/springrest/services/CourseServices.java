package com.example.springrest.services;

import java.util.List;

import com.example.springrest.entities.Course;

public interface CourseServices {

	public List<Course> getCourses();
	 
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
}
