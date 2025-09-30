package com.example.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	List<Course> list;

	public CourseServiceImpl() {

		list = new ArrayList<>();
		list.add(new Course(122, "Jova", "java is a power full tool"));
		list.add(new Course(123, "SQL", "SQL is a power full tool"));
		list.add(new Course(124, "Python", "Python is a power full tool"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c = null;
		for (Course course : list)
			if (course.getId() == courseId) {
				c = course;
				break;
			}

		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}