/*
 * Задание 4
 *
 * Создайте каталог(папку).
 * Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
 * Считываем текст из 2-ого задания, получаем его длинну (576 символов).
 * Для каждого файла генерируем рандомное число от 0 до 576,
 * достаем из текста (из 2 задания) такое-же количество символов (string.substring()) и сохраняем в наш файл.
 * Создайте файл result.txt и запишите туда список всех файлов и их размеры.
 */

package by.academy.homework6.task4;

import java.io.*;
import java.util.Random;

public class Task4 {

	private static final Random random = new Random();

	public static void main(String[] args) throws IOException {

		File dir = new File("src/by/academy/homework6/task4", "files");               //folder for the files
		if (!dir.exists()) {
			//noinspection ResultOfMethodCallIgnored
			dir.mkdirs();
		}

		File task2 = new File("src/by/academy/homework6/task2", "Task2.txt");         //Existing file
		if (task2.exists()) {
			System.out.println("Исходный файл успешно найден");

			File result = new File(dir, "result.txt");
			if (!result.exists()) {
				//noinspection ResultOfMethodCallIgnored
				result.createNewFile();
			}

			File[] files = dir.listFiles((file, name) -> name.matches("^[0-9]+\\.txt"));     //Filtered array of files

			createFiles(dir);

			if (files != null) {
				fillFiles(files, readFile(task2), task2);
				result(files, result);
			}
		} else {
			throw new IOException("Исходный файл не найден");
		}
	}

	private static void createFiles(File dir) throws IOException {                                 //creates 100 files in the folder
		for (int i = 1; i <= 100; i++) {
			File file = new File(dir, i + ".txt");
			if (!file.exists()) {
				//noinspection ResultOfMethodCallIgnored
				file.createNewFile();
			}
		}
	}

	private static String readFile(File task2) throws IOException {                                //reads existing file and returns String

		BufferedReader br = new BufferedReader(new FileReader(task2));
		StringBuilder s = new StringBuilder();
		String tempString;

		try {
			while ((tempString = br.readLine()) != null) {
				s.append(tempString);
			}
			System.out.println("Размер исходного файла \"" + task2.getName() +
					"\" составляет " + task2.length() + " байт");
		} catch (IOException e) {
			e.printStackTrace();
		}
		br.close();
		return s.toString();
	}

	private static void fillFiles(File[] files, String string, File task2) throws IOException {         //fills files with random amount of symbols from the existing file

		for (File f : files) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
				bw.write(string.substring(0, random.nextInt(0, (int) (task2.length() + 1))));
			}
		}
	}

	private static void result(File[] files, File dir) {                                                //fills result file

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(dir))) {
			for (File f : files) {
				bw.write(f.getName() + " - " + f.length() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






