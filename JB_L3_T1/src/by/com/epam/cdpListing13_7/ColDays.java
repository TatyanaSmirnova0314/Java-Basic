package by.com.epam.cdpListing13_7;

import java.util.Scanner;

public class ColDays {

	public static void main(String[] args) {
		System.out.print("Введите год: ");
		int consoleYear = consoleEnterYear();
		System.out.print("Введите номер месяца: ");
		int consoleMonth = consoleEnterMonth();
		System.out.println("Количество дней равно - " + processing(consoleYear, consoleMonth));
	}

	public static int consoleEnterYear() {
		int year = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			year = sc.nextInt();
		}
		return year;
	}

	public static int consoleEnterMonth() {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		}
		return month;
	}

	public static int processing(int consoleYear, int consoleMonth) {
		int col_day = 0;
		switch (consoleMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (consoleYear % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		return col_day;
	}

}
