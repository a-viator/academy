package by.academy.homework3;

public class Electronics extends Product {

	short voltage;                      //110 В, 220 В, 380 В

	public Electronics() {
		super();
	}

	public Electronics(String name, double quantity, double price, short voltage) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.voltage = voltage;
	}

	@Override
	public String toString() {
		return "Electronics{" +
				"voltage=" + voltage +
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

	public short getVoltage() {
		return voltage;
	}

	public void setVoltage(short voltage) {
		this.voltage = voltage;
	}
}
