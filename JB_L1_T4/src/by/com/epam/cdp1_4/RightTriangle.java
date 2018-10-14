package by.com.epam.cdp1_4;

public class RightTriangle {

	private double hypot;
	private double square;
	private double cath1;
	private double cath2;

	public RightTriangle(double cath1, double cath2) {
		this.cath1 = cath1;
		this.cath2 = cath2;
	}

	public double findHypot() {
		hypot = Math.sqrt(Math.pow(cath1, 2) + Math.pow(cath2, 2));
		return hypot;
	}

	public double findSquare() {
		square = 0.5 * cath1 * cath2;
		return square;
	}

}
