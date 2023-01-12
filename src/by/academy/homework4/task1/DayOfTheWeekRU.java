package by.academy.homework4.task1;

public enum DayOfTheWeekRU {

	MONDAY("Понедельник"),
	TUESDAY("Вторник"),
	WEDNESDAY("Среда"),
	THURSDAY("Четверг"),
	FRIDAY("Пятница"),
	SATURDAY("Суббота"),
	SUNDAY("Воскресенье");

	public final String name;

	DayOfTheWeekRU(String name) {

		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
