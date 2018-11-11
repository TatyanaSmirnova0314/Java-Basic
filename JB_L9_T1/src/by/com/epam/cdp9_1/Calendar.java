package by.com.epam.cdp9_1;

public class Calendar extends PrintEdition {

	public int year;

	public Calendar(String title, int year) {
		super(title);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "title = " + title + ", year = " + year;
	}
}
