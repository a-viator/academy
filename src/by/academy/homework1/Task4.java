/*
 * Задание 4.
 *
 * Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
 */

package by.academy.homework1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int a;
		int b;
		int power;

		System.out.println("Введите число: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.close();

		b = a;

		for (power = 1; b <= 1_000_000; power++) {
			b = (int) Math.pow(a, power);
			System.out.println(a + " в степени " + power + " равен " + b);
		}
	}
}
