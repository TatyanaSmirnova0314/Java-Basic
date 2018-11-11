package by.com.epam.cdp8_2;

public class Payment {

	private String product;
	private double price;

	public Payment(String product, double price) {
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product= " + product + ", price= " + price;
	}

}
