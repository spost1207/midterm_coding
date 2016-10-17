package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	
	public double getGrade() {
		return Grade;
	}
	
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	
	public UUID getStudentID() {
		return StudentID;
	}
}
