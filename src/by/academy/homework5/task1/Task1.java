/*
 * Задание 1.
 *
 * Можно писать все в main. Не нужно создавать новых классов.
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

package by.academy.homework5.task1;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println(arrayList);

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("А");
		linkedList.add("Б");
		linkedList.add("В");
		linkedList.add("В");
		linkedList.add("В");
		linkedList.add("Г");
		linkedList.add("Д");

		System.out.println(linkedList);

		System.out.println(removeDuplicates(arrayList));
		System.out.println(removeDuplicates(linkedList));
	}

	private static <T> Collection<T> removeDuplicates(Collection<T> list) {
		return new TreeSet<>(list);
	}
}
