package by.com.epam.cdp5_1;

import java.util.Random;

public class ArrayFraction {

	int k = 5;
	int randomValue = 5;
	Fraction[] massFraction;

	public Fraction[] generateMass() {
		if (k < 0) {
			System.out.println("Error: array size cannot be negative");
			System.exit(1);
		}
		massFraction = new Fraction[k];
		Random rand = new Random();
		for (int i = 0; i < k; i++) {
			int m = rand.nextInt(randomValue);
			int n = rand.nextInt(randomValue);
			Fraction fraction = new Fraction(m, n);
			fraction.calcFunction();
			massFraction[i] = fraction;
		}
		return massFraction;
	}

	public void printMass() {
		System.out.println("\n" + "Array from " + k + " fractions:");
		for (int i = 0; i < massFraction.length; i++) {
			System.out.println(massFraction[i].getM() + "/" + massFraction[i].getN());
		}
	}
}
