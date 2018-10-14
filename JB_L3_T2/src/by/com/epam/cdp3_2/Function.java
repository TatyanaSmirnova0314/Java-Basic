package by.com.epam.cdp3_2;

public class Function {

	private double function;
	private double x;
	private double a;
	private double b;
	private double h;

	public Function(double x, double a, double b, double h) {
		this.x = x;
		this.a = a;
		this.b = b;
		this.h = h;
	}

	public double calcFunction() {
		function = 2 * Math.tan(x / 2) + 1;
		return function;
	}

	public void calcResult() {
		if (a < b) {
			if (h < b - a) {
				if (h > 0) {
					for (x = a; x < b; x = x + h) {
						calcFunction();
						printResults();
					}
				} else
					System.out.println("Error: 'h' cannot be '0' or less than '0'");
				System.exit(1);
			}
			System.out.println("Error: 'h' should be less than 'b-a'");
			System.exit(1);
		}
		System.out.println("Error: 'a' should be less than 'b'");
	}

	public void printResults() {
		System.out.println(x + "\t" + "\t" + calcFunction());
	}

}
