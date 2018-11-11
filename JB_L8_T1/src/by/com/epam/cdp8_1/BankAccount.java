package by.com.epam.cdp8_1;

public class BankAccount {

	private int bankAccountNumber;
	private double bankAccountSum;

	public BankAccount(int bankAccountNumber, double bankAccountSum) {
		this.bankAccountNumber = bankAccountNumber;
		this.bankAccountSum = bankAccountSum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		BankAccount bankAccount = (BankAccount) obj;
		if (bankAccountNumber != bankAccount.bankAccountNumber) {
			return false;
		}
		if (bankAccountSum != bankAccount.bankAccountSum) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * bankAccountNumber + 31 * bankAccountSum);
	}

	@Override
	public String toString() {
		return "Bank Account Number = " + bankAccountNumber + ", Bank Account Sum = " + bankAccountSum;
	}

}
