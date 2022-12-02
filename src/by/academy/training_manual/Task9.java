/*
 * Задание 9
 *
 * Задать целое число в виде переменной, это число - сумма денег в рублях.
 * Вывести это число на экран, добавив к нему слово "рублей" в правильном падеже.
 */
package by.academy.training_manual;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		int money;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите сумму в рублях: ");

		money = sc.nextInt();
		sc.close();

		if (money % 10 == 0) {
			System.out.println(money + " рублей");
		} else if (money % 10 == 1) {
			System.out.println(money + " рубль");
		} else if (money % 10 == 2 || money % 10 == 3 || money % 10 == 4) {
			System.out.println(money + " рубля");
		} else {
			System.out.println(money + " рублей");
		}
	}
}
