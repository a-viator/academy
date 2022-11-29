/*
 * Задание 1.
 *
 * Ввести с консоли сумму покупки в магазине и возраст покупателя,
 * в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.
 * Скидки:
 *	1) Сумма до 100 рублей -> 5%
 *	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
 *	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
 *	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
 *	5) Сумма покупки больше 400 рублей включая -> 20%
 * В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая)
 * и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%.
 */

package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int age;                                            //age of the customer
		double price;                                       //purchase price without discount
		Scanner scan = new Scanner(System.in);

		System.out.print("Введите свой возраст: ");
		age = scan.nextInt();
		System.out.print("Введите стоимость покупок: ");
		price = scan.nextDouble();
		scan.close();

		if (price < 100) {
			price = price - price * 0.05;
			System.out.println("С Вас " + price + " рублей");
		} else if (price >= 100 && price < 200) {
			price = price - price * 0.07;
			System.out.println("С Вас " + price + " рублей");
		} else if (price >= 200 && price < 300) {
			if (age > 18) {
				price = price - price * 0.16;
				System.out.println("С Вас " + price + " рублей");
			} else {
				price = price - price * 0.09;
				System.out.println("С Вас " + price + " рублей");
			}
		} else if (price >= 300 && price < 400) {
			price = price - price * 0.15;
			System.out.println("С Вас " + price + " рублей");
		} else if (price >= 400) {
			price = price - price * 0.2;
			System.out.println("С Вас " + price + " рублей");
		}
	}
}
