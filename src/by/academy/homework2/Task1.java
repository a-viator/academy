/*
 * Задание 1.
 *
 * Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки.
 * Учитываем регистр. Не использовать сортировку :)
 * Например:
 *          “hello” и “hlleo” -> true
 *          “hello” и “art” -> false
 */
package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		String str1;
		String str2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введи первую строку: ");
		str1 = sc.nextLine();
		System.out.println("Введи вторую строку: ");
		str2 = sc.nextLine();
		sc.close();
		char[] s1 = str1.toCharArray();                             //заполняю символьный массив символами из строки
		char[] s2 = str2.toCharArray();                             //заполняю символьный массив символами из строки

		if (s1.length == s2.length) {                               //проверка длинны строк
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i] == s2[j]) {
						s1[i] = '\u0000';                           //заменяю символом, который точно не попадётся
						s2[j] = '\u0000';
					}
				}
			}
			if (Arrays.equals(s1,s2)) {                             //не работает, если сравнивать через " == "
				System.out.println("\"" + str1 + "\"" + " и " + "\"" + str2 + "\" -> true");
			} else {
				System.out.println("\"" + str1 + "\"" + " и " + "\"" + str2 + "\" -> false");
			}
		} else {
			System.out.println("\"" + str1 + "\"" + " и " + "\"" + str2 + "\" -> false");
		}
	}
}
