package by.academy.homework3;

public class Product {

	protected String name;
	protected double quantity;
	protected double price;

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
		return "Product{" +
				"name='" + name + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				'}';
	}

	public double calcPrice() {                 //метод подсчёта стоимости
		return price * quantity * discount();
	}

	public double discount() {                  //метод подсчёта скидки
		return 1;
	}

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
