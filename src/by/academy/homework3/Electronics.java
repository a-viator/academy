package by.academy.homework3;

public class Electronics extends Product {

	private int voltage;                      //110 В, 220 В, 380 В

	public Electronics() {
		super();
	}

	public Electronics(String name, double quantity, double price, int voltage) {
		super(name, quantity, price);
		this.voltage = voltage;
	}

	@Override
	public String toString() {
		return "Electronics " + super.toString() +
				", voltage=" + voltage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Electronics that = (Electronics) o;
		return voltage == that.voltage;
	}

	public double discount() {
		if (getQuantity() >= 2) {
			return 0.9;
		}
		return 1;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
}
