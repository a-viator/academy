/*
 * Задание 21
 *
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произволными значениями целочисленного типа.
 * Найдите максимальный элемент и выведите его индекс.
 */

package by.academy.training_manual;

import java.util.Random;

public class Task21 {

	public static void main(String[] args) {

		int[] arr = new int[10];                       //объявил массив и задал его размер (10)
		Random random = new Random();                  //вызвал класс Random для заполнения массива случайными числами

		/* Заполняю массив */

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);        //присваиваю случайное число от 0 до 10
			System.out.print(arr[i] + " ");            //вывожу элементы массива, чтобы потом сравнить результат
		}

		/* Поиск максимального элемента */

		int max = arr[0];                              //предполагаю, что максимальный элемент будет на 0 позиции
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {                        //если моё предположение не верно - исправить мою ошибку
				max = arr[i];
				index = i;
			}
		}
		System.out.println("\nМаксимальное значение - " + max);
		System.out.println("Его индекс - " + index);
	}
}
