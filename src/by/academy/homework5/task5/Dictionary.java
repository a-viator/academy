/*
 * Задание 5.
 *
 * Можно писать все в main. Не нужно создавать новых классов.
 * Имеется текст. Следует составить для него частотный словарь:
 * Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.
 */

package by.academy.homework5.task5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	public static void main(String[] args) {

		String str = "qwertyq 1234567890 /";
		char[] array = str.toCharArray();
		Map<Character, Integer> dictionary = new HashMap<>();

		for (char c : array) {
			int v = 0;
			for (char value : array) {
				if (c == value) {
					v++;
				}
			}
			dictionary.put(c, v);
		}
		System.out.println(dictionary);
	}
}
