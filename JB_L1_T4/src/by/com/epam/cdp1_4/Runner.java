package by.com.epam.cdp1_4;

public class Runner {

	public static void main(String[] args) {
		RightTriangle rightTriangle = new RightTriangle(18, 2);
		System.out.println("hypotenuse of right triangle = " + rightTriangle.findHypot() + "\n");
		System.out.println("square of right triangle = " + rightTriangle.findSquare());
	}

}
