package by.com.epam.cdp5_1;

public class Fraction {

	private int m;
	private int n;
	private int function;

	public Fraction(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public int getN() {
		return n;
	}

	public int calcFunction() {
		if (n == 0) {
			System.out.println("Error: cannot devide by zero. Generate another one number");
		} else
			function = m / n;
		return function;
	}
}
