/*
 * Задание 3.
 *
 * Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
 */

package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int number;
		int multiplier = 1;

		Scanner scan = new Scanner(System.in);
		System.out.print("Введите простое число: ");

		if (scan.hasNextInt()) {                               //проверка на целочисленность
			number = scan.nextInt();
			if (number > 0 && number < 11) {                   //ограничение чисел от 1 до 10
				System.out.println("Таблица умножения для данного числа будет выглядеть так: ");
				while (multiplier <= 10) {
					System.out.println(number + " x " + multiplier + " = " + number * multiplier);
					multiplier++;
				}
			} else {
				System.out.println("Введите число от 1 до 10");
			}
		} else {
			System.out.println("Введите простое число!");
		}
		scan.close();
	}
}
