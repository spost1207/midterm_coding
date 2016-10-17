package com.cisc181.core;
import com.cisc181.eNums.eMajor;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	public Course() {
	}
	
	public Course(String coursename, int gradepoints, eMajor major) {
		super();
		
		CourseName = coursename;
		GradePoints = gradepoints;
		eMajor = major;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(UUID courseID){
		CourseID = courseID;
	}
	
	public eMajor geteMajor() {
		return eMajor;
	}
	
	public void seteMajor(eMajor major){
		eMajor = major;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String coursename) {
		CourseName = coursename;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	
	public void setGradePoints(int gradepoints) {
		GradePoints = gradepoints;
	}
	
}
