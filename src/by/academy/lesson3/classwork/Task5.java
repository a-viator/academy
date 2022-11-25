package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		double c;


		Scanner scan = new Scanner(System.in);
		System.out.print("Введи первое число: ");
		double a = scan.nextDouble();

		System.out.print("Введи второе число: ");
		double b = scan.nextDouble();

		scan.close();

		c = (a + b) / 2;

		if (a > b) {
			System.out.println(a + " > " + b);
		} else if (a < b) {
			System.out.println(a + " < " + b);
		} else {
			System.out.println(a + " = " + b);
		}
		System.out.println("Среднее арифметическое = " + c);
	}
}
