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

		String str = "Qqwertyq / 1234567899!<>,.";
		Map<Character, Integer> dictionary = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			int value = 1;
			char symbol = str.charAt(i);
			if (!dictionary.containsKey(symbol)) {
				dictionary.put(symbol, 1);
			} else {
				dictionary.put(symbol, ++value);
			}
		}
		System.out.println(dictionary);
	}
}
