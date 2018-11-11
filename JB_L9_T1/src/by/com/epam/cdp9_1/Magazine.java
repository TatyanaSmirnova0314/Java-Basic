package by.com.epam.cdp9_1;

public class Magazine extends PrintEdition {

	private String editorInChief;
	private String releaseDate;

	public Magazine(String title, String editorInChief, String releaseDate) {
		super(title);
		this.editorInChief = editorInChief;
		this.releaseDate = releaseDate;
	}

	public String getEditorInChief() {
		return editorInChief;
	}

	public void setEditorInChief(String editorInChief) {
		this.editorInChief = editorInChief;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "title = " + title + ", editor in chief = " + editorInChief + ", release date = " + releaseDate;
	}

}
