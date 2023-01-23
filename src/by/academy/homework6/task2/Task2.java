/*
 * Задание 2
 *
 * Создать руками текстовый файл, закинуть следующий текст:
 * "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's
 * standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make
 * a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting,
 * remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing
 * Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions
 * of Lorem Ipsum."
 * Создать новый файл result.txt.
 * Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.
 */

package by.academy.homework6.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/task2");
		if (!dir.exists()) {
			//noinspection ResultOfMethodCallIgnored
			dir.mkdirs();
		}

		File task2 = new File(dir, "Task2.txt");                            //файл с исходным текстом

		File result = new File(dir, "result.txt");                          //файл с отформатированным текстом
		if (!result.exists()) {
			//noinspection ResultOfMethodCallIgnored
			result.createNewFile();
		}

		try (FileInputStream fileIn = new FileInputStream(task2);
		     FileOutputStream fileOut = new FileOutputStream(result)) {

			int a;

			while ((a = fileIn.read()) != -1) {
				if ((char) a != ' ') {
					fileOut.write(a);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
