package by.academy.homework3;

public class Shoes extends Product {

	String size;

	public Shoes() {
		super();
	}

	public Shoes(String name, double quantity, double price, String size) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shoes{" +
				"size='" + size + '\'' +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				'}';
	}

	@Override
	public double calcPrice() {
		return super.calcPrice();
	}

	@Override
	public double discount() {
		return super.discount();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
