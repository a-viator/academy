package by.academy.homework3;

import by.academy.homework3.annotation.Producer;

@Producer(StartYear = 2022, country = "Беларусь", founderFullName = "Марко")
public class Shoes extends Product {

	private int size;

	public Shoes() {
		super();
	}

	public Shoes(String name, double quantity, double price, int size) {
		super(name, quantity, price);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shoes " + super.toString()
				+ ", size='" + size + '\'';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Shoes shoes = (Shoes) o;
		return size == shoes.size;
	}

	public double discount() {
		if (2 <= getQuantity() && getQuantity() <= 5) {
			return 0.9;
		} else if (getQuantity() > 5) {
			return 0.8;
		}
		return 1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
