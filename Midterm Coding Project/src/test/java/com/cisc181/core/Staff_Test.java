package com.cisc181.core;

import com.cisc181.eNums.eTitle;

import java.util.Date;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList<Staff> staffTeam = new ArrayList<Staff>();
	
	public static Date Date(int month, int day, int year) {
		Calendar date = Calendar.getInstance();
		date.set(month-1,day,year);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException{
		staffTeam.add(new Staff("Sarah","Helen","Post", Date(12,7,1996),"83 Elmont Place","(848)-462-1260","spost@udel.edu","3 to 5", 1, 6000, Date(2,5,2016),eTitle.MS));
		staffTeam.add(new Staff("Jake","Bert","Black", Date(11,9,1995),"1 courtyard Pl","(732)-464-1263","Jack@udel.edu","4 to 5", 2, 8000, Date(3,4,2018),eTitle.MR));
		staffTeam.add(new Staff("Olivia","Becca","Hanily",Date(10,12,1830),"1 Easton","908-801-7577","bless@udel.edu","5 to 7", 3, 10000, Date(4,8,2017),eTitle.MS));
		staffTeam.add(new Staff("Brett","Grant","Bab", Date(9,2,1990),"8 help rd","(782)-460-1256","omg@udel.edu","8 to 9", 4, 9000, Date(3,7,2014),eTitle.MRS));
		staffTeam.add(new Staff("John","Michael","Mazza", Date(12,17,2000),"333 Cypress Ave","(800)-431-1310","John@udel.edu","2 to 5", 5, 2000, Date(6,2,2019),eTitle.MS));
	}
	
	@Test(expected = PersonException.class)
	public void DOBtestings() throws PersonException {
		Staff staffmember = new Staff("Olivia","Becca","Hanily",Date(10,12,1830),"1 Easton","908-801-7577","bless@udel.edu","5 to 7", 3, 10000, Date(4,8,2017),eTitle.MS);
	}
	
	@Test(expected = PersonException.class)
	public void Phone_Number_Test() throws PersonException {
		Staff staffmember = new Staff("Olivia","Becca","Hanily",Date(10,12,1830),"1 Easton","908-801-7577","bless@udel.edu","5 to 7", 3, 10000, Date(4,8,2017),eTitle.MS);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SalaryTest() {
		double sum = 0;
		for(Staff staff : staffTeam) {
			sum = (sum + staff.getSalary());
		}
		double salaryAverage = sum / staffTeam.size();
		assertEquals(salaryAverage,7000);
	}	

}
