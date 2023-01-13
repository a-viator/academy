/*
 * Задание 3.
 *
 * Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
 * Протестировать в main.
 */

package by.academy.homework5.task3;

import java.util.Iterator;

public class TwoDimensionalArrayIterator<T> implements Iterator<T> {

	private T[][] array;
	int i = 0;
	int j = 0;

	@SuppressWarnings("unused")
	public TwoDimensionalArrayIterator() {
		super();
	}

	public TwoDimensionalArrayIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && j < array[i].length;
	}

	@Override
	public T next() {
		T element = array[i][j++];
		if (j >= array[i].length) {
			j = 0;
			i++;
		}
		return element;
	}
}
