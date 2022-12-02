/*
 * Задание 5
 *
 * Написать метод, который принимает на вход два целых числа, делает их суммирование
 * и складывает результат с произведением двух этих чисел, и возвращает полученный
 * результат из метода.
 * Передать на вход в метод любые два числа.
 * Вывести полученный результат метода на экран.
 */
package by.academy.training_manual;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введи первое число: ");
		a = sc.nextInt();
		System.out.println("Введи второе число: ");
		b = sc.nextInt();
		sc.close();


		System.out.println(calculations(a,b));
	}
	static int calculations(int a,int b) {
		return (a + b) + a * b;
	}
}
