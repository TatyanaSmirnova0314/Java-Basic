package by.com.epam.cdp8_1;

public class Runner {

	public static void main(String[] args) {
		BankAccount bankAccount1 = new BankAccount(24, 34.6);
		BankAccount bankAccount2 = new BankAccount(24, 34.6);
		
		if(bankAccount1.equals(bankAccount2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println(bankAccount1.hashCode());
		System.out.println(bankAccount2.hashCode());
		
		System.out.println(bankAccount1);
		System.out.println(bankAccount2);
	}

}
