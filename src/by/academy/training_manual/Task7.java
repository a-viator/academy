/*
 * Задание 7
 *
 * Создайте метод с одним целочисленным параметром.
 * Метод должен определить, является ли последняя цифра числа семёркой и вернуть boolean значение.
 */
package by.academy.training_manual;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		int number;
		int lastDigit;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число: ");
		number = sc.nextInt();
		System.out.println("Введите предпологаемую последнюю цифру для проверки: ");
		lastDigit = sc.nextInt();

		if (qualifier(number, lastDigit)) {
			System.out.println("Верно");
		} else {
			System.out.println("Не верно");
		}
	}

	public static boolean qualifier(int x, int y) {        //x - число, y - предпологаемая последняя цифра

		boolean isTrue = true;
		boolean isFalse = false;
		int z = x % 10;                                     //последняя цифра числа

		if (z == y) {
			return isTrue;
		} else {
			return isFalse;
		}
	}
}
