package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	
	public static Date newDate(int month, int day, int year){
		Calendar date = Calendar.getInstance();
		date.set(month-1, day, year);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException{
		Course Physics = new Course("Intro to Physics", 3, eMajor.PHYSICS);
		Course Nursing = new Course("Nursing 101",3, eMajor.NURSING);
		Course Business = new Course("Business Intro", 3, eMajor.BUSINESS);
		courses.add(Physics);
		courses.add(Nursing);
		courses.add(Business);
		
		Semester fall = new Semester(newDate(8,2,2013), newDate(3,12,2015));
		Semester spring = new Semester(newDate(7,4,2018), newDate(3, 5, 2020));
		semesters.add(fall);
		semesters.add(spring);
		
		Section fallPhysics = new Section(Physics.getCourseID(), fall.getSemesterID(), 106);
		Section fallNursing = new Section(Nursing.getCourseID(), fall.getSemesterID(), 101);
		Section fallBusiness = new Section(Business.getCourseID(), fall.getSemesterID(), 110);
		Section springPhysics = new Section(Physics.getCourseID(), spring.getSemesterID(), 107);
		Section springNursing = new Section(Nursing.getCourseID(), spring.getSemesterID(), 102);
		Section springBusiness = new Section(Business.getCourseID(), spring.getSemesterID(), 111);
		sections.add(fallPhysics);
		sections.add(fallNursing);
		sections.add(fallBusiness);
		sections.add(springPhysics);
		sections.add(springNursing);
		sections.add(springBusiness);
		
		Student student1 = new Student("Sam", "Joe", "Calvin", newDate(1,7,1992), eMajor.NURSING, "83 ELMONT PL", "(732)-100-1000", "compsci@udel.edu");
		Student student2 = new Student("Nico", "Eric", "Neil", newDate(2,8,1993), eMajor.BUSINESS, "10 EAST WAY", "(848)-200-1001", "eat@udel.edu");
		Student student3 = new Student("John", "Mike", "Mazza", newDate(3,9,1994), eMajor.PHYSICS, "050 EASY STREET", "(908)-300-1002", "mainstreet@udel.edu");
		Student student4 = new Student("Drew", "Kline", "Hennessy", newDate(4,10,1995), eMajor.PHYSICS, "131 SOUTH CHAPEL", "(732)-400-1003", "honeygrow@udel.edu");
		Student student5 = new Student("Amanda","Plaid", "Jeans", newDate(5,11, 1996), eMajor.BUSINESS, "407 NORTH CHAP", "(848)-500-1004", "blank@udel.edu");
		Student student6 = new Student("Sal", "Greg", "Shambles", newDate(6,12,1997), eMajor.NURSING, "900 GREEN STREET", "(908)-600-1005", "nurse@udel.edu");
		Student student7 = new Student("Michael", "Esto", "Rimerez", newDate(7,13,1998), eMajor.NURSING, "58 BENNY STREET", "(732)-700-1006", "pizza@udel.edu");
		Student student8 = new Student("Brett", "Nick", "Clancy", newDate(8,14,1999), eMajor.PHYSICS, "99 CISC WAY", "(848)-800-1007", "icecrean@udel.edu");
		Student student9 = new Student("Brandon", "Anthony", "FettyWap", newDate(9,15,2000), eMajor.BUSINESS, "320 RIGHT LANE", "(908)-900-1008", "wapwap@udel.edu");
		Student student10 = new Student("Christine", "Sara", "Nope", newDate(10,16,2001), eMajor.NURSING, "90 BRAXTON STREET", "(732)-800-1009", "chicken@udel.edu");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		
		
		for (Section section : sections){
			for (Student student : students){
				enrollments.add(new Enrollment(student.getStudentID(), section.getSectionID()));
			}
		}
		
	}
	
	public void setGrade() {
		for (Enrollment enrollment : enrollments){
			if (enrollment.getStudentID() == students.get(0).getStudentID()){
				enrollment.setGrade(100);
			}
			else if (enrollment.getStudentID() == students.get(1).getStudentID()) {
				enrollment.setGrade(90);
			}
			else if (enrollment.getStudentID() == students.get(2).getStudentID()) {
				enrollment.setGrade(80);
			}
			else if (enrollment.getStudentID() == students.get(3).getStudentID()) {
				enrollment.setGrade(70);
			}
			else if (enrollment.getStudentID() == students.get(4).getStudentID()) {
				enrollment.setGrade(60); 
			}
			else if (enrollment.getStudentID() == students.get(5).getStudentID()) {
				enrollment.setGrade(50);
			}
			else if (enrollment.getStudentID() == students.get(6).getStudentID()) {
				enrollment.setGrade(90);
			}
			else if (enrollment.getStudentID() == students.get(7).getStudentID()) {
				enrollment.setGrade(80);
			}
			else if (enrollment.getStudentID() == students.get(8).getStudentID()) {
				enrollment.setGrade(70);
			}
			else {
				if
					(enrollment.getStudentID() == students.get(9).getStudentID()) {
					enrollment.setGrade(60);
				}
			}
		}
	}
	
	
	private double gpa(Student student) {
		double gpa = 0;
		double inc = 0;
		for (int i = 0; i <= 59; i++) {
			inc++;
			if (enrollments.get(i).getGrade() >= 90) {
				gpa += 4.0;
			} else if (enrollments.get(i).getGrade() >= 80) {
				gpa += 3.0;
			} else if (enrollments.get(i).getGrade() >= 70) {
				gpa += 2.0;
			} else if (enrollments.get(i).getGrade() >= 60) {
				gpa += 1.0;
			} else {
				gpa += 0.0;
			}

		}
		gpa = gpa / inc;
		return gpa;

	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void gpaTest() {
		assertEquals(gpa(students.get(0)), 4.0);
		assertEquals(gpa(students.get(1)), 4.0);
		assertEquals(gpa(students.get(2)), 3.0);
		assertEquals(gpa(students.get(3)), 2.0);
		assertEquals(gpa(students.get(4)), 1.0);
		assertEquals(gpa(students.get(5)), 1.0);
		assertEquals(gpa(students.get(6)), 4.0);
		assertEquals(gpa(students.get(7)), 3.0);
		assertEquals(gpa(students.get(8)), 2.0);
		assertEquals(gpa(students.get(9)), 1.0);
		
	}
	
	@Test
	public void Testing_Major_Switch(){
		assertTrue(students.get(0).geteMajor() == eMajor.NURSING);
		assertFalse(students.get(0).geteMajor() == eMajor.PHYSICS);
		students.get(0).seteMajor(eMajor.BUSINESS);
		assertTrue(students.get(0).geteMajor() == eMajor.BUSINESS);
		assertFalse(students.get(0).geteMajor() == eMajor.PHYSICS);
	}
	
}