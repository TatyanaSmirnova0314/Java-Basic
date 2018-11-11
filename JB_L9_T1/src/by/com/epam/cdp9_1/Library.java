package by.com.epam.cdp9_1;

import java.util.ArrayList;

public class Library {

	private static ArrayList<PrintEdition> library;

	public static void fillLibrary() {
		Book book1 = new Book("Alice in Wonderland", "Lewis Carroll", 1865);
		Magazine magazine1 = new Magazine("Forbes", "Steve Forbes", "15.01.2015");
		Calendar calendar1 = new Calendar("Pirelli", 2018);

		library = new ArrayList<>();
		library.add(book1);
		library.add(magazine1);
		library.add(calendar1);
	}

	public static void printLibrary() {
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
	}

}
