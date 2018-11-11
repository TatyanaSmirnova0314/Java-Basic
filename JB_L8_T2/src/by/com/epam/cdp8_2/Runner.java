package by.com.epam.cdp8_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Payment xbox = new Payment("xboxOne", 400);
		Payment iPhone = new Payment("iPhoneXS", 1400);
		Payment tv = new Payment("LG_TV", 1600);

		List<Payment> paymentOne = new ArrayList<Payment>();
		paymentOne.add(xbox);
		paymentOne.add(iPhone);
		paymentOne.add(tv);

		for (int i = 0; i < paymentOne.size(); i++) {
			System.out.println(paymentOne.get(i));
		}
	}

}
