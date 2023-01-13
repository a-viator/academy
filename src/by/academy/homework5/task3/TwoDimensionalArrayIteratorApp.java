package by.academy.homework5.task3;

public class TwoDimensionalArrayIteratorApp {

	public static void main(String[] args) {

		String[][] array = {{"H", "e", "l", "l", "o", ",", " "}, {"W", "o", "r", "l", "d", "!"}};
		TwoDimensionalArrayIterator<String> iterator = new TwoDimensionalArrayIterator<>(array);

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
}
