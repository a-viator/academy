/*
 * Задание 19
 *
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа и выведените последний элемент массива на экран.
 */
package by.academy.training_manual;

public class Task19 {

	public static void main(String[] args) {

		int[] mass = {10, 9, 8, 7, 6, 5, 4, 3, 2, 6};
		System.out.println("Последний элемент массива: " + mass[mass.length - 1]);
	}
}
