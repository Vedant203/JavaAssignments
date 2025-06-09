package com;

public class Enrolment {

	private Student student;
	private Course course;
	
	public Enrolment(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}
	
	public void showEnrollmentDetails() {
		this.student.displayStudentInfo();
		this.course.displayCourseInfo();
	}
	
}
