/*
 * Задание 3
 *
 * Ввести 2 слова, состоящих из чётного числа букв.
 * Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
 */
package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		String word1;
		String word2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое слово: ");
		word1 = sc.nextLine();
		if (word1.length() % 2 == 0) {
			System.out.println("Введите второе слово: ");
			word2 = sc.nextLine();
			sc.close();
			if (word2.length() % 2 == 0) {

				char[] w1 = word1.toCharArray();
				char[] w2 = word2.toCharArray();
				char[] word = new char[w1.length / 2 + w2.length / 2];
				for (int i = 0; i < w1.length / 2; i++) {
					word[i] = w1[i];
				}
				int k = w2.length / 2;
				for (int j = w1.length / 2; j < word.length; j++) {
					word[j] = w2[k];
					k++;
				}
				String s = new String(word);
				System.out.println(s);

			} else {
				System.out.println("В слове должно быть чётное количетво символов");
			}
		} else {
			System.out.println("В слове должно быть чётное количетво символов");
		}
	}
}
