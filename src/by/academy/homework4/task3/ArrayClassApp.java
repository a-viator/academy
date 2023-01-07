package by.academy.homework4.task3;

public class ArrayClassApp {

	public static void main(String[] args) {

		ArrayClass<Integer> array = new ArrayClass<>();
		int index = 3;
		int indexToRemove = 4;
		Integer toRemove = 7;
		array.print();

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		array.add(11);
		array.add(12);
		array.add(13);
		array.add(14);
		array.add(15);
		array.add(16);
		array.add(17);
		array.add(18);

		array.print();

		System.out.println("2) элемент под " + index + " индексом: " + array.get(index));
		System.out.println("3) последний элемент: " + array.getLast());
		System.out.println("4) первый элемент: " + array.getFirst());
		System.out.println("5) размер массива: " + array.size());
		System.out.println("6) индекс последнего заполненого элемента: " + array.lastIndex());
		System.out.println("7) удаление элемента под индексом: " + indexToRemove + ", сам элемент: " + array.remove(indexToRemove));

		array.print();

		System.out.println("8) удаление элемента с значением " + array.removeObj(toRemove));

		array.print();


	}
}
