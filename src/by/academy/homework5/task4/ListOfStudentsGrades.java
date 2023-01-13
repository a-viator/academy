/*
 * Задание 4.
 *
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */

package by.academy.homework5.task4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStudentsGrades {

	public static void main(String[] args) {

		//Все совпадения случайны
		Students student1 = new Students("Антон", randomGrade());
		Students student2 = new Students("Андрей", randomGrade());
		Students student3 = new Students("Олег", randomGrade());
		Students student4 = new Students("Татьяна", randomGrade());
		Students student5 = new Students("Влад", 3);
		Students student6 = new Students("Я", 10);

		ArrayList<Students> studentsArrayList = new ArrayList<>();

		studentsArrayList.add(student1);
		studentsArrayList.add(student2);
		studentsArrayList.add(student3);
		studentsArrayList.add(student4);
		studentsArrayList.add(student5);
		studentsArrayList.add(student6);

		Iterator<Students> iterator = studentsArrayList.iterator();

		print(studentsArrayList);

		bestStudent(iterator);
	}

	private static int randomGrade() {                                          //рандомизация оценок

		return (int) (Math.random() * 11);
	}

	private static void bestStudent(Iterator<Students> iterator) {              //метод поиска и вывода первого лучшего ученика

		Students firstBestStudent = new Students();
		while (iterator.hasNext()) {
			Students helpBestStudent;
			if (firstBestStudent.getGrade() == 0) {
				firstBestStudent = iterator.next();
			} else {
				helpBestStudent = iterator.next();
				if (helpBestStudent.getGrade() > firstBestStudent.getGrade()) {
					firstBestStudent = helpBestStudent;
				}
			}
		}
		System.out.println("Первый лучший ученик " + firstBestStudent);
	}

	private static void print(ArrayList<Students> arrayList) {                  //метод вывода списка студентов

		int number = 1;                                                         //порядковый номер студента
		for (Students students : arrayList) {
			System.out.println(number++ + ". " + students);
		}
	}
}
