package by.com.epam.objects;

import java.util.Random;

public class Student {

	private int mark;
	private int marksAmount;

	public int getMarksAmount() {
		return marksAmount;
	}

	public Student(int marksAmount) {
		this.marksAmount = marksAmount;

	}

	public int generateMark() {
		Random random = new Random();
		mark = random.nextInt(5) + 1; // add +1 to avoid mark=0
		return mark;
	}

}
