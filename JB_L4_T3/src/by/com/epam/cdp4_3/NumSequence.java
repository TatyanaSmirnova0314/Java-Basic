package by.com.epam.cdp4_3;

import java.util.Random;

public class NumSequence {

	double[] mass;
	boolean result;

	public double[] generateMass(int massSize) {
		if (massSize < 0) {
			System.out.println("Error: array size cannot be negative");
			System.exit(1);
		}
		mass = new double[massSize];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = new Random().nextInt(60);
			System.out.println(mass[i]);
		}
		return mass;
	}

	public boolean verifyIncrease() {
		for (int i = 0; i < mass.length; i++) {
			if ((i + 1) < mass.length && mass[i] < mass[i + 1]) {
				result = true;
			} else
				result = false;
		}
		return result;
	}

	public void printResult() {
		if (result == true) {
			System.out.println("The given sequence of real numbers is increasing");
		} else
			System.out.println("The given sequence of real numbers is not increasing");
	}

}
