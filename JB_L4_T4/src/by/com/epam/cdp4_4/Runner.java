package by.com.epam.cdp4_4;

public class Runner {

	public static void main(String[] args) {

		IntSequence intSequence = new IntSequence();
		intSequence.generateMass(10);
		intSequence.countZero();
		intSequence.createZeroMass();
		intSequence.printZeroMass();
	}

}
