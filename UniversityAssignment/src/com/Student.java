package com;

public class Student {

	private int studentId;
	private String studentName;
	private String email;
	public Student(int studentId, String studentName, String email) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student ID: "+studentId);
		System.out.println("Student name: "+studentName);
		System.out.println("Student email: "+email);
	}
	
}
