package by.academy.homework7.task2;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private int age;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		age = Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	public String getFirstName() {
		return firstName;
	}

	@SuppressWarnings("unused")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@SuppressWarnings("unused")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@SuppressWarnings("unused")
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		age = Period.between(dateOfBirth, LocalDate.now()).getYears();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", dateOfBirth=" + dateOfBirth +
				", age=" + age +
				'}';
	}
}
