/*
 * Задание 6.
 *
 * Попробовать добавить в массив int на 8 элементов 10 чисел.
 * Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
 * "Array is to small, expand the array".
 */

package by.academy.homework5.task6;

import java.util.Arrays;

public class MyExceptionApp {

	public static void main(String[] args) {

		int[] array = new int[8];

		try {
			array[1] = 1;
			for (int i = 0; i < 10; i++) {
				array[i] = i + 1;
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array is to small, expand the array");
		} finally {
			System.out.println(Arrays.toString(array));
		}
	}
}
