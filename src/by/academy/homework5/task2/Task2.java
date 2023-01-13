/*
 * Задание 2.
 *
 * Можно писать все в main. Не нужно создавать новых классов.
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
 * Замерьте время, которое потрачено на это.
 * Сравните результаты и предположите, почему они именно такие.
 */

package by.academy.homework5.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		double timeToFillArrayList;                                 //время заполнения ArrayList
		double timeToFillLinkedList;                                //время заполнения LinkedList
		double timeToGetFromArrayList;                              //время выбора случайных элементов в ArrayList
		double timeToGetFromLinkedList;                             //время выбора случайных элементов в LinkedList

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		timeToFillArrayList = fillingTime(arrayList);
		timeToFillLinkedList = fillingTime(linkedList);

		System.out.print("В добавлении элементов ");
		timeDifference(timeToFillArrayList, timeToFillLinkedList);

		timeToGetFromArrayList = gettingTime(arrayList);
		timeToGetFromLinkedList = gettingTime(linkedList);

		System.out.print("В получении элементов ");
		timeDifference(timeToGetFromArrayList, timeToGetFromLinkedList);
	}

	private static void fillTheList(List<Integer> list) {           //метод заполнения коллекции
		for (int i = 0; i < 1_000_00; i++) {
			list.add(i, i);
		}
	}

	@SuppressWarnings("ResultOfMethodCallIgnored")
	private static void getRandomElements(List<Integer> list) {     //метод получения рандомного элемента из коллекции
		Random random = new Random();
		for (int i = 0; i < 1_000_00; i++) {
			list.get(random.nextInt(list.size()));
		}
	}

	private static double fillingTime(List<Integer> list) {         //метод подсчёта времени заполнения коллекции
		long start = System.currentTimeMillis();
		fillTheList(list);
		long finish = System.currentTimeMillis();
		return (finish - start) / 1000d;
	}

	private static double gettingTime(List<Integer> list) {         //метод подсчёта времени получения элемента из коллеции
		long start = System.currentTimeMillis();
		getRandomElements(list);
		long finish = System.currentTimeMillis();
		return (finish - start) / 1000d;
	}

	private static void timeDifference(double arrayListTime, double linkedListTime) {      //метод подсчёта разницы времени
		if (arrayListTime > linkedListTime) {
			double diff = arrayListTime - linkedListTime;
			System.out.println("LinkedList быстрее на " + diff + " секунд");
		} else {
			double diff = linkedListTime - arrayListTime;
			System.out.println("ArrayList быстрее на " + diff + " секунд");
		}
	}
}
