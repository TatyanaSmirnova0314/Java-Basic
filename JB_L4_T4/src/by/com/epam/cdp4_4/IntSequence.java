package by.com.epam.cdp4_4;

import java.util.Random;

public class IntSequence {

	int[] mass;
	int[] mass0;
	int zeroAmount;

	public int[] generateMass(int massSize) {
		if (massSize < 0) {
			System.out.println("Error: array size cannot be negative");
			System.exit(1);
		}
		mass = new int[massSize];
		System.out.println("Integer sequence:");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = new Random().nextInt(10);
			System.out.println(mass[i]);
		}
		return mass;
	}

	public int countZero() {
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				zeroAmount += 1;
			}
		}
		return zeroAmount;
	}

	public int[] createZeroMass() {
		int j = 0;
		mass0 = new int[zeroAmount];
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 0) {
				mass0[j] = i;
				j += 1;
			}
		}
		return mass0;
	}

	public void printZeroMass() {
		System.out.println("Array from zero's:");
		for (int i = 0; i < mass0.length; i++) {
			System.out.println(mass0[i]);
		}
	}
}
