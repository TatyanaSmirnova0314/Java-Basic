package by.com.epam.cdpListing13_6;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {

		System.out.print("Введите число: ");
		int number = consoleEnter();
		System.out.println("Квадрат числа " + number + " равняется " + processing(number));
	}

	public static int consoleEnter() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}

	public static int processing(int number) {
		int poslZifra;
		int poslZifraKv = 0;
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");
		}
		return poslZifraKv;
	}
}
