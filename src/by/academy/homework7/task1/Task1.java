/*
 * Задача 1. Stream/Lambda.
 *
 * Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
 * Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
 * Пропустив первые 3 числа произвести следующие операции:
 * Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).
 */

package by.academy.homework7.task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		Map<Double, String> map = Stream.generate(() -> new Random().nextLong(100L))
				.limit(100)
				.map(i -> i * Math.PI - 20)
				.filter(i -> i < 100)
				.sorted()
				.skip(3)
				.collect(Collectors.toMap(k -> k, v -> "Number: " + v, (first, second) -> first));
		System.out.println(map);
	}
}
