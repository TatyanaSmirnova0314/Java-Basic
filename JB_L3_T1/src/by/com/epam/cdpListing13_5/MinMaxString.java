package by.com.epam.cdpListing13_5;

import java.util.Scanner;

public class MinMaxString {

	public static void main(String[] args) {

		processing();

	}

	public static String consoleEnter() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("> ");
		if (sc.hasNextLine()) {
			str = sc.nextLine();
		}
		return str;
	}

	public static void processing() {
		String max = "", min = "", str = "";
		int n = 10;
		for (int i = 0; i < n; i++) {
			str = consoleEnter();
			if (i == 0) {
				min = str;
			}
			if (str.length() > max.length()) {
				max = str;
			} else if (str.length() < min.length()) {
				min = str;
			}
		}
		print(max, min);
	}

	public static void print(String max, String min) {
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
}
