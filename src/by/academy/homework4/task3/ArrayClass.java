/*
 * Задание 3.
 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
 * Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
 * Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
 *
 * Содержит методы:
 * 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
 * 2) взятие по индексу get(int i)
 * 3) взятие последнего элемента getLast()
 * 4) взятие первого элемента getFirst()
 * 5) вывод размера массива
 * 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
 * 7) удаление элемента по индексу (remove(int i)
 * 8) удаление элемента по значению (remove(T obj))
 */

package by.academy.homework4.task3;

import java.util.Arrays;

public class ArrayClass<T> {

	private static final int DEFAULT_CAPACITY = 16;
	private T[] array;
	private int index = 0;

	@SuppressWarnings("unchecked")
	public ArrayClass() {
		super();
		this.array = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@SuppressWarnings({"unchecked", "unused"})
	public ArrayClass(int length) {
		super();
		this.array = (T[]) new Object[length];
	}

	public void add(T obj) {                                                    //1) добавление элемента в массив
		if (array.length <= index) {
			grow();
		}
		array[index++] = obj;
	}

	public void grow() {                                                        //1.1) увеличение размера массива
		array = Arrays.copyOf(array, array.length * 2 + 1);
	}

	public T get(int i) {                                                       //2) взятие по индексу
		if (i > array.length) {
			return null;
		}
		return array[i];
	}

	public T getLast() {                                                        //3) взятие последнего элемента
		if (index == 0) {
			return null;
		}
		return array[index - 1];
	}

	public T getFirst() {                                                       //4) взятие первого элемента
		if (index == 0) {
			return null;
		}
		return array[0];
	}

	public int size() {                                                         //5) вывод размера массива
		return index;
	}

	public int lastIndex() {                                                    //6) вывод индекса последнего заполненого элемента
		return array.length - 1;
	}

	public T remove(int i) {                                                    //7) удаление элемента по индексу
		T temp = array[i];
		System.arraycopy(array, i + 1, array, i, array.length - i - 1);
		index--;
		return temp;
	}

	public T removeObj(T obj) {                                                 //8) удаление элемента по значению
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(obj)) {
				return remove(i);
			}
		}
		return null;
	}

	public void print() {                                                       //печать значений массива (без null) не используя цикл
		array = Arrays.copyOf(array, index);
		System.out.println(Arrays.toString(array));
	}
}
