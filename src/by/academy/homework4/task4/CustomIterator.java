/*
 * Задание 4.
 *
 * Написать свой итератор для массива
 */

package by.academy.homework4.task4;

import java.util.Arrays;

public class CustomIterator<T> {

	private T[] array;
	private int index = -1;
	boolean canRemove = false;

	@SuppressWarnings("unused")
	public CustomIterator() {
		super();
	}

	public CustomIterator(T[] array) {
		super();
		this.array = array;
	}

	public T next() {
		index++;
		canRemove = true;
		return array[index];
	}

	public boolean hasNext() {
		//noinspection RedundantIfStatement
		if (index + 1 < array.length) {
			return true;
		} else {
			return false;
		}
	}

	public void remove() {
		if (canRemove) {
			canRemove = false;
			T[] tempArray = Arrays.copyOf(array, array.length - 1);
			System.arraycopy(array, index + 1, tempArray, index, array.length - index - 1);
			array = tempArray;
			index--;
		} else {
			System.err.println("Method \"next()\" was not called");
		}
	}

	public T[] getArray() {
		return array;
	}
}
