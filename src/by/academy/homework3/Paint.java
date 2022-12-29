package by.academy.homework3;

public class Paint extends Product {

	private String color;

	public Paint() {
		super();
	}

	public Paint(String name, double quantity, double price, String color) {
		super(name, quantity, price);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Paint{" +
				"color='" + color + '\'' +
				"} " + super.toString();
	}

	public double discount() {
		if (color.equals("белый")) {
			return 0.9;
		}
		return 1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
