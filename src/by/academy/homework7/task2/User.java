package by.academy.homework7.task2;

import java.time.LocalDate;

public class User extends Person {

	private String login;
	private String password;
	private String email;

	@SuppressWarnings("unused")
	User() {
		super();
	}

	User(String firstName, String lastName, LocalDate dateOfBirth, String login, String password, String email) {
		super(firstName, lastName, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	@SuppressWarnings("unused")
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	@SuppressWarnings("unused")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	@SuppressWarnings("unused")
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				"} " + super.toString();
	}

	public void printUserInfo() {
		System.out.printf("%-15s%27s%n", "Имя: ", getFirstName());
		System.out.printf("%-15s%27s%n", "Фамилия: ", getLastName());
		System.out.printf("%-15s%13td %8tB %tY%n", "Дата рождения: ",
				getDateOfBirth(), getDateOfBirth(), getDateOfBirth());
		System.out.printf("%-15s%27s%n", "Возраст: ", getAge());
		System.out.printf("%-15s%27s%n", "Логин: ", getLogin());
		System.out.printf("%-15s%27s%n", "Пароль: ", getPassword());
		System.out.printf("%-15s%27s%n", "e-mail: ", getEmail());
	}
}
