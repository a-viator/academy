/*
 * Задание 4
 *
 * Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
 * Программа получает число n, задаваемое с консоли пользователем, и раздаёт карты на n игроков (по 5 карт каждому)
 * из рассортированной колоды.
 * Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 */
package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		String[] deck = {"A♠", "K♠", "Q♠", "J♠", "10♠", "9♠", "8♠", "7♠", "6♠", "5♠", "4♠", "3♠", "2♠",
				"A♣", "K♣", "Q♣", "J♣", "10♣", "9♣", "8♣", "7♣", "6♣", "5♣", "4♣", "3♣", "2♣",
				"A♥", "K♥", "Q♥", "J♥", "10♥", "9♥", "8♥", "7♥", "6♥", "5♥", "4♥", "3♥", "2♥",
				"A♦", "K♦", "Q♦", "J♦", "10♦", "9♦", "8♦", "7♦", "6♦", "5♦", "4♦", "3♦", "2♦"};

		for (; ; ) {                                                //зациклил ввод, чтобы программа не останавливалась
			System.out.println("На скольких раздавать? ");
			if (sc.hasNextInt()) {                                  //проверка на целочисленность
				int temp = sc.nextInt();
				if (1 < temp && temp < 11) {
					n = temp;
					shuffle(deck);                                  //вызов метода перетусовки колоды
					deal(n, deck);                                  //вызов метода раздачи карт
//					dealAlternative(n, deck);                       //вызов метода раздачи карт, якобы по одной
					break;
				} else {
					System.out.println("В покере от 2 до 10 игроков");
				}
			} else {
				System.out.println("Введите целое число");
				sc.next();                                          //обнуляю сканнер
			}
		}
		sc.close();
	}

	/* Метод, который тусует колоду */

	public static void shuffle(String[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			int rand = random.nextInt(array.length);
			String temp = array[rand];
			array[rand] = array[i];
			array[i] = temp;
		}
		System.out.print(Arrays.toString(array) + "\n");            //вывожу растусованую колоду для проверки
	}

	/* Метод, который раздаёт игрокам по 5 карт */

	public static void deal(int n, String[] array) {
		System.out.println("\nРаздаю на " + n + ":\n");

		for (int i = 0; i < n * 5; i++) {
			System.out.print(array[i]);
			if (i % 5 == 4) {
				System.out.println("\n");
			}
		}
	}

	/* Метод, который раздаёт игрокам по 5 карт (псевдо по одной) */

//	public static void dealAlternative(int n, String[] array) {
//		System.out.println("\nРаздаю на " + n + ":\n");
//		for (int i = 0; i < n; i++) {
//			System.out.println(array[i] + " " + array[i + n] + " " + array[i + n * 2] + " " + array[i + n * 3] + " " + array[i + n * 4] + "\n");
//		}
//	}
}
