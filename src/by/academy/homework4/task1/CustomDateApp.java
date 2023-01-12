package by.academy.homework4.task1;

import java.util.Scanner;

public class CustomDateApp {

	public static void main(String[] args) {

		String inputDate1;
		String inputDate2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первую дату в формате \"dd-MM-yyyy\": ");
		inputDate1 = sc.nextLine();

		CustomDate date1 = new CustomDate(CustomDate.inputDate(inputDate1, sc));

		System.out.println("Введите вторую дату в формате \"dd-MM-yyyy\": ");
		inputDate2 = sc.nextLine();

		CustomDate date2 = new CustomDate(CustomDate.inputDate(inputDate2, sc));

		sc.close();

		System.out.println(date1.isLeapYear());
		date1.dayOfTheWeek();
		date1.daysQuantity(date2);
	}
}
