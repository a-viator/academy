/*
 * Задание 2
 *
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
 * Если таких слов несколько, найти первое из них.
 */

package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("Введите количество слов: ");

		int n;                                           //количество слов
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();                                //вводим с консоли количество слов
		sc.nextLine();                                   //обнуляю сканнер

		String[] words = new String[n];                  //массив строк на "n" слов

		int[] symbols = new int[words.length];           //массив, в котором будет храниться кол-во уникальных символов

		for (int i = 0; i < n; i++) {
			System.out.println("Введи слово: ");
			words[i] = sc.nextLine();
		}
		sc.close();

		for (int i = 0; i < words.length; i++) {                //заполняю массивы символов словами из массива слов
			char[] word = words[i].toCharArray();
			int[] counter = new int[2048];                      //размер массива зависит от используемых символов
			for (int j = 0; j < word.length; j++) {             //считаю количество каждого символа в слове
				counter[word[j]]++;
				if (counter[word[j]] == 1) {
					symbols[i]++;
				}
			}
		}

		int min = symbols[0];                        //предполагаю, что минимальное количество символов у первого слова
		int minIndex = 0;                            //предполагаемый индекс слова с минимальным количеством символов

		for (int l = 0; l < symbols.length; l++) {
			if (min > symbols[l]) {
				min = symbols[l];
				minIndex = l;
			}
		}
		System.out.println("Первое слово с минимальным количеством различных символов - " + words[minIndex]);
		System.out.println("Количество уникальных символов в нём - " + symbols[minIndex]);
	}
}
