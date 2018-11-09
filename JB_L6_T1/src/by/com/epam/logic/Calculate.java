package by.com.epam.logic;

import by.com.epam.objects.Group;
import by.com.epam.objects.Student;

public class Calculate {

	Group groupA = new Group(8);
	Student marks = new Student(4);
	int[][] students = new int[groupA.getGroupSize()][marks.getMarksAmount()];
	private int highestMark = 5;
	private int expectedMark = 2;

	public void generateGroup() {
		for (int i = 0; i < groupA.getGroupSize(); i++) {
			for (int j = 0; j < marks.getMarksAmount(); j++) {
				students[i][j] = marks.generateMark();
			}
		}
		for (int i = 0; i < groupA.getGroupSize(); i++) {
			System.out.print("Student " + (i + 1) + ": ");
			for (int j = 0; j < marks.getMarksAmount(); j++) {
				System.out.print(students[i][j] + ";" + "");
			}
			System.out.println();
		}
		System.out.println();
	}

	public double calculateAverageGroupMark() {
		double averageGroupMark = 0;
		double sum = 0;
		if (groupA.getGroupSize() > 0 & marks.getMarksAmount() > 0) {
			for (int i = 0; i < groupA.getGroupSize(); i++) {
				for (int j = 0; j < marks.getMarksAmount(); j++) {
					sum += students[i][j];
				}
			}
			averageGroupMark = sum / (groupA.getGroupSize() * marks.getMarksAmount());
		} else {
			System.out.println("Group doesn't have any student or students doesn't have amy mark");
			System.exit(1);
		}
		return averageGroupMark;
	}

	public void calculateAverageStudentMark() {
		double averageStudentMark = 0;
		if (groupA.getGroupSize() > 0 & marks.getMarksAmount() > 0) {
			for (int i = 0; i < groupA.getGroupSize(); i++) {
				double sum = 0;
				for (int j = 0; j < marks.getMarksAmount(); j++) {
					sum += students[i][j];
					averageStudentMark = sum / marks.getMarksAmount();
				}
				System.out.println("Student " + (i + 1) + ": average mark = " + averageStudentMark);
			}
			System.out.println();
		} else {
			System.out.println("Group doesn't have any student or students doesn't have any mark");
			System.exit(1);
		}
	}

	public int calculateExcellentStudents() {
		int counter = 0;
		double averageStudentMark = 0;
		if (groupA.getGroupSize() > 0 & marks.getMarksAmount() > 0) {
			for (int i = 0; i < groupA.getGroupSize(); i++) {
				double sum = 0;
				for (int j = 0; j < marks.getMarksAmount(); j++) {
					sum += students[i][j];
					averageStudentMark = sum / marks.getMarksAmount();
				}
				if (averageStudentMark == highestMark)
					counter += 1;
			}
		} else {
			System.out.println("Group doesn't have any student or students doesn't have amy mark");
			System.exit(1);
		}
		return counter;
	}

	public int calculateStudentWithExpectedMark() {
		int counter = 0;
		if (groupA.getGroupSize() > 0 & marks.getMarksAmount() > 0) {
			for (int i = 0; i < groupA.getGroupSize(); i++) {
				for (int j = 0; j < marks.getMarksAmount(); j++) {
					if (students[i][j] == expectedMark) {
						counter += 1;
						break;
					}
				}
			}
		} else {
			System.out.println("Group doesn't have any student or students doesn't have amy mark");
			System.exit(1);
		}
		return counter;
	}

}
