package by.academy.homework6.task3;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;
	private int age;

	User() {
		super();
	}

	User(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				'}';
	}
}
