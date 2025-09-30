package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Course;
import com.example.springrest.services.CourseServices;

@RestController
public class Mycontroller {
	
	@Autowired
	private CourseServices courseServices;
	
	
	@GetMapping("/home")
	public String home() 
	{
		return "this is home method";
	}
	
	//get the courses 
	@GetMapping("/courses")
	public List<Course> getCourse()
	{
		return this.courseServices.getCourses();
	}
	
	//getting the single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseServices.getCourse(Long.parseLong(courseId));
	}
	
	
	//add the courses
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		
		return this.courseServices.addCourse(course);
	}
}
