package com;

public class Course {

	private int courseId;
	private String courseName;
	private String instructor;
	
	public Course(int courseId, String courseName, String instructor) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	
	public void displayCourseInfo() {
		System.out.println("Course ID: "+courseId);
		System.out.println("Course name: "+courseName);
		System.out.println("Course instructor: "+instructor);
	}
	
}
