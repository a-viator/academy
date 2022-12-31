package by.academy.homework3;

import java.util.Objects;

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
		return "Paint " + super.toString() +
				", color ='" + color + '\'';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Paint paint = (Paint) o;
		return Objects.equals(color, paint.color);
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
