package by.com.epam.cdp3_3;

public class Formula {

	private double function;
	private double x;

	public Formula(double x) {
		this.x = x;
	}

	public double calcFormula() {
		if (x <= -3) {
			function = 9;
		} else if (x > 3) {
			function = 1 / ((Math.pow(x, 2)) + 1);
		} else {
			System.out.println("Error: 'x' should be >3 OR <=-3");
			System.exit(1);
		}
		return function;
	}

}
