/*
 * Задание 8
 * Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа.
 * Определить можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
package by.academy.training_manual;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		int a;                                                      //сторона прмяоуголника
		int b;                                                      //сторона прямоуголника
		int r;                                                      //радиус круга
		Scanner sc = new Scanner(System.in);

		System.out.println("Введи сторону прямоуголника: ");
		a = sc.nextInt();
		System.out.println("Введи вторую сторону прямоуголника: ");
		b = sc.nextInt();
		System.out.println("Введи радиус картонки: ");
		r = sc.nextInt();
		sc.close();

		if (4 * r * r >= squareDiagonal(a, b)) {
			System.out.println("Круг закроет прямоуголник");
		} else {
			System.out.println("Нужен круг побольше");
		}
	}

	public static int squareDiagonal(int x, int y) {

		return x * x + y * y;                                      //квадрат диагонали прямоуголника
	}
}
