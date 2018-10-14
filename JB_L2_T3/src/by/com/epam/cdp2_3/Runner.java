package by.com.epam.cdp2_3;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		double r;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter double data type number");

		while (!scanner.hasNextDouble()) {
			System.out.println("Error: please enter double data type number");
			scanner.next();
		}

		r = scanner.nextDouble();

		Circle circle = new Circle(r);
		System.out.println("\n" + "circle circumference = " + circle.calcCircum() + "\n");
		System.out.println("area of circle = " + circle.calcSquare());
	}

}
