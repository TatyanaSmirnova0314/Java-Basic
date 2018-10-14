package by.com.epam.cdp4_3;

public class Runner {

	public static void main(String[] args) {

		NumSequence numSequence = new NumSequence();
		numSequence.generateMass(8);
		numSequence.verifyIncrease();
		numSequence.printResult();
	}

}
