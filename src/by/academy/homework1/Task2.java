/*
 * Задание 2.
 *
 * Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
 *	a) если тип данных int, вывести остаток от деления на 2
 *	b) если double, вывести 70% от числа
 *	c) если float, возвести в квадрат
 *	d) если char, вывести код символа (charAt(0))
 *	e) String, вывести на экран строку в виде ("Hello " + переменная)
 *	f) во всех остальных случаях вывести на экран ("Unsupported type");
 */

package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		int input1;
		double input2;
		float input3;
		boolean isTrue = true;
		String input4;
		String input5;
		Scanner scan = new Scanner(System.in);

		do {                                          //Если ввёл неправильное значение - перезапускает программу
			System.out.print("Введите тип данных: ");
			String type = scan.nextLine();

			switch (type) {
				case "int":
					do {
						System.out.print("Введите значение переменной: ");
						if (scan.hasNextInt()) {
							input1 = scan.nextInt();
							input1 %= 2;
							System.out.println("Остаток от деления на 2 равен " + input1);
							isTrue = false;
						} else {
							System.out.println("Введите int переменную!");
							scan.nextLine();                                                //очистка сканнера
						}
					} while (isTrue);
					break;
				case "double":
					do {
						System.out.print("Введите значение переменной: ");
						if (scan.hasNextDouble()) {
							input2 = scan.nextDouble();
							input2 = input2 * 0.7;
							System.out.println("70% от числа равны: " + input2);
							isTrue = false;
						} else {
							System.out.println("Введите double переменную!");
							scan.nextLine();                                                //очистка сканнера
						}
					} while (isTrue);
					break;
				case "float":
					do {
						System.out.print("Введите значение переменной: ");
						if (scan.hasNextFloat()) {
							input3 = scan.nextFloat();
							input3 *= input3;
							System.out.println("Квадрат числа равен: " + input3);
							isTrue = false;
						} else {
							System.out.println("Введите float переменную!");
							scan.nextLine();                                                //очистка сканнера
						}
					} while (isTrue);
					break;
				case "char":
					System.out.print("Введите значение переменной: ");
					input4 = scan.nextLine();
					System.out.print("Первым символом был " + input4.charAt(0));
					isTrue = false;
					break;
				case "String":
					System.out.print("Введите значение переменной: ");
					input5 = scan.nextLine();
					System.out.print("Hello " + input5);
					isTrue = false;
					break;
				default:
					System.out.println("Unsupported type");
			}
		} while (isTrue);
		scan.close();
	}
}
