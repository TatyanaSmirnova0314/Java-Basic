package by.com.epam.cdp2_2;

public class Formula {
	
	private double result;
	private double num;
	private double denum;
	private double radExpr;
	private double a;
	private double b;
	private double c;
	
	public Formula (double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double calcRadExpr() {
		radExpr=Math.pow(b, 2) + 4*a*c;
		return radExpr;
	}
	
	public double calcNum() {
		if (calcRadExpr()<0) {
			System.out.println("Error: radical expression cannot be less than 0");
			System.exit(1);
		}
		num = b + radExpr;
		return num;
	}
	
	public double calcDenum() {
		if(a==0) {
			System.out.println("Error: 'a' cannot be 0");
			System.exit(1);
		}
		denum=2*a;
		return denum;
	}
			
	public double calcFormula() {
		result = calcNum() / calcDenum() - Math.pow(a, 3) * c + b;
		return result;
	}
}
