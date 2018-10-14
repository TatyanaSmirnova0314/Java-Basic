package by.com.epam.cdp4_2;

import java.util.Random;

public class NatNumber {

	int[] mass;
	int sumResult;
	int randomRange = 20;

	public int[] generateMass(int massSize) {
		if (massSize < 0) {
			System.out.println("Error: array size cannot be negative");
			System.exit(1);
		}
		mass = new int[massSize];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = new Random().nextInt(randomRange) + 1; // 0 is not considered a natural number, therefore, to any
																// generated number need to add 1
			System.out.println(mass[i]);
		}
		return mass;
	}

	public void findSum(int k) {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % k == 0) {
				sumResult += mass[i];
			}
		}
		System.out.println("The sum of elements that are multiples of " + k + " = " + sumResult);
	}
}
