package by.com.epam.cdpListing13_8;

import java.util.Scanner;

public class Line01 {
	public static void main(String[] args) {

		System.out.print("Введите число: ");
		int consoleNumber = consoleEnter();
		boolean result = processing(consoleNumber);
		print(result);
	}

	public static int consoleEnter() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt())
			number = sc.nextInt();
		return number;
	}

	public static boolean processing(int consoleNumber) {
		int digit = 0;
		boolean result = false;
		while (consoleNumber != 0) {
			digit = consoleNumber % 10;
			consoleNumber = consoleNumber / 10;
			if (digit % 2 == 0) {
				result = true;
			}
		}
		return result;
	}

	public static void print(boolean result) {
		if (result == true) {
			System.out.println("В числе есть четная цифра.");
		} else
			System.out.println("В числе нет четных цифр.");
	}
}
