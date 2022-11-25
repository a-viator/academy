package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		String month;

		Scanner scan = new Scanner(System.in);
		System.out.println("Введи название месяца с маленькой буквы:");
		month = scan.nextLine();

		switch (month) {
			case "январь" -> System.out.println("1 месяц");
			case "февраль" -> System.out.println("2 месяц");
			case "март" -> System.out.println("3 месяц");
			case "апрель" -> System.out.println("4 месяц");
			case "май" -> System.out.println("5 месяц");
			case "июнь" -> System.out.println("6 месяц");
			case "июль" -> System.out.println("7 месяц");
			case "август" -> System.out.println("8 месяц");
			case "сентябрь" -> System.out.println("9 месяц");
			case "октябрь" -> System.out.println("10 месяц");
			case "ноябрь" -> System.out.println("11 месяц");
			case "декабрь" -> System.out.println("12 месяц");
			default -> System.out.println("Нет такого месяца");
		}
		scan.close();
	}
}
