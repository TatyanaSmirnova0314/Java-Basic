package by.com.epam.runner;

import by.com.epam.logic.Calculate;

public class Runner {

	public static void main(String[] args) {

		Calculate calculate = new Calculate();
		calculate.generateGroup();
		System.out.println("Average group mark = " + calculate.calculateAverageGroupMark() + "\n");
		calculate.calculateAverageStudentMark();
		System.out.println("Number of excellent students = " + calculate.calculateExcellentStudents() + "\n");
		System.out.println("Number of students with mark '2' = " + calculate.calculateStudentWithExpectedMark());
		
	}

}
