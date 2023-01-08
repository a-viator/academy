package by.academy.homework4.task4;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

	private T[] array;
	private int index;

	public CustomIterator() {
		super();
	}

	public CustomIterator(T[] array) {
		super();
		this.array = array;
	}

	public T next() {
		return array[index++];
	}

	public boolean hasNext() {
		if (array.length <= index || array == null) {
			return false;
		} else {
			return true;
		}
	}
}
