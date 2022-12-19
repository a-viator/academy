package by.academy.homework3;

public class Paint extends Product {

	String color;

	public Paint() {
		super();
	}

	public Paint(String name, double quantity, double price, String color) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Paint{" +
				"color='" + color + '\'' +
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
