package by.com.epam.cdp9_1;

public class Book extends PrintEdition {

	private String author;
	private int year;

	public Book(String title, String author, int year) {
		super(title);
		this.author = author;
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "title = " + title + ", author = " + author + ", year = " + year;
	}
}
