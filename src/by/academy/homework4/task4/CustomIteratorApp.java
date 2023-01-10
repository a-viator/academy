package by.academy.homework4.task4;

import java.util.Arrays;

public class CustomIteratorApp {

	public static void main(String[] args) {

		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		CustomIterator<Integer> iterator = new CustomIterator<>(array);

		System.out.println(Arrays.toString(array));

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
			iterator.remove();
			array = iterator.getArray();
			System.out.println(Arrays.toString(array));
		}
	}
}