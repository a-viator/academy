/*
 * Задание 1
 *
 * Прочесть информацию введенную с клавиатуры и записать в созданный вами txt файл,
 * если введена "stop" строка тогда закончить запись в файл.
 */

package by.academy.homework6.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	private static final String STOP = "stop";

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/task1");     //создаю исключительно, если данной папки у кого-то нет.
		if (!dir.exists()) {
			//noinspection ResultOfMethodCallIgnored
			dir.mkdirs();
		}

		File file = new File(dir, "Task1.txt");
		if (!file.exists()) {
			//noinspection ResultOfMethodCallIgnored
			file.createNewFile();
		}

		System.out.println("Введите текст, если хотите остановиться, введите \"stop\": ");

		try (FileWriter fw = new FileWriter(file); Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String str = sc.nextLine();
				if (str.equals(STOP)) {
					return;
				} else {
					fw.write(str + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
