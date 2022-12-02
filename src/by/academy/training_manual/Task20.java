/*
 * Задание 20
 *
 * Создайте переменную для массива из 10 элементов (другим способом).
 * Заполните его произвольными значениями целочисленного типа и
 * выведите на экран элементы , стоящие на чётных позициях.
 */
package by.academy.training_manual;

public class Task20 {

	public static void main(String[] args) {

		int[] mass = new int[10];
		mass[0] = 10;
		mass[1] = 9;
		mass[2] = 8;
		mass[3] = 7;
		mass[4] = 6;
		mass[5] = 5;
		mass[6] = 4;
		mass[7] = 3;
		mass[8] = 2;
		mass[9] = 1;
		for (int i = 1; i < mass.length; i++) {
			if (i % 2 == 0) {
				System.out.println(mass[i]);
			}
		}
	}
}
