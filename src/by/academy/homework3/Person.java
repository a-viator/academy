package by.academy.homework3;

public class Person {

	private String name;
	private double money;

	public Person() {
		super();
	}

	public Person (String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", money=" + money +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}
}
