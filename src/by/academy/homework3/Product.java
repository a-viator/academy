package by.academy.homework3;

public abstract class Product {

	private String name;
	private double quantity;
	private double price;

	public Product() {
		super();
	}

	public Product(String name, double quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name = '" + name + '\'' +
				", quantity = " + quantity +
				", price = " + price;
	}

	@Override
	public boolean equals(Object o) {                                          //убрал quantity и price из сравнения
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return name.equals(product.name);
	}

	public final double calcSubTotalPrice() {                                  //метод подсчёта стоимости продукта
		return getPrice() * getQuantity() * discount();
	}

	protected abstract double discount();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
