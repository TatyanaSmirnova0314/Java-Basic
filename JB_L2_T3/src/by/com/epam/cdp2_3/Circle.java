package by.com.epam.cdp2_3;

public class Circle {

	private double r;
	private double circum;
	private double square;

	public Circle(double r) {
		this.r = r;
	}

	public double calcCircum() {
		circum = 2 * Math.PI * r;
		return circum;
	}

	public double calcSquare() {
		square = Math.PI * Math.pow(r, 2);
		return square;
	}

}
