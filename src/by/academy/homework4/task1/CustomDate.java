package by.academy.homework4.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String date) {
		super();
		this.year = new Year(date);
		this.month = new Month(date);
		this.day = new Day(date);
	}

	public class Year {

		int year;

		public Year() {
			super();
		}

		public Year(String date) {
			super();
			this.year = Integer.parseInt(date.substring(6, 10));
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			return "Year{" +
					"year=" + year +
					'}';
		}
	}

	public class Month {
		int month;

		public Month() {
			super();
		}

		public Month(String date) {
			super();
			this.month = Integer.parseInt(date.substring(3, 5));
		}

		public int getMonth() {
			return month;
		}

		@Override
		public String toString() {
			return "Month{" +
					"month=" + month +
					'}';
		}
	}

	public class Day {
		int day;

		public Day() {
			super();
		}

		public Day(String date) {
			super();
			this.day = Integer.parseInt(date.substring(0, 2));
		}

		public int getDay() {
			return day;
		}

		@Override
		public String toString() {
			return "Day{" +
					"day=" + day +
					'}';
		}
	}

	public Year getYear() {
		return year;
	}

	public Month getMonth() {
		return month;
	}

	public Day getDay() {
		return day;
	}

	public void dayOfTheWeek() {
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		switch (localDate.getDayOfWeek()) {
			case MONDAY:
				System.out.println(DayOfTheWeekRU.MONDAY.toString());
				break;
			case TUESDAY:
				System.out.println(DayOfTheWeekRU.TUESDAY.toString());
				break;
			case WEDNESDAY:
				System.out.println(DayOfTheWeekRU.WEDNESDAY.toString());
				break;
			case THURSDAY:
				System.out.println(DayOfTheWeekRU.THURSDAY.toString());
				break;
			case FRIDAY:
				System.out.println(DayOfTheWeekRU.FRIDAY.toString());
				break;
			case SATURDAY:
				System.out.println(DayOfTheWeekRU.SATURDAY.toString());
				break;
			case SUNDAY:
				System.out.println(DayOfTheWeekRU.SUNDAY.toString());
				break;
		}
	}

	public void daysQuantity(CustomDate customDate2) {
		LocalDate localDate1 = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		LocalDate localDate2 = LocalDate.of(customDate2.getYear().getYear(), customDate2.getMonth().getMonth(),
				customDate2.getDay().getDay());
		if (localDate1.isAfter(localDate2)) {
			System.out.println("Количество дней в заданном промежутке: " + (localDate1.toEpochDay() - localDate2.toEpochDay()));
		} else {
			System.out.println("Количество дней в заданном промежутке: " + (localDate2.toEpochDay() - localDate1.toEpochDay()));
		}
	}

	public boolean isLeapYear() {
		return ((year.getYear() % 4 == 0) && (year.getYear() % 100 != 0)) || (year.getYear() % 400 == 0);
	}

	public static String inputDate(String date, Scanner sc) {
		while (!DateValidator.validate(date)) {
			date = sc.nextLine();
		}
		return date;
	}

	@Override
	public String toString() {
		return "CustomDate{" +
				"year=" + year +
				", month=" + month +
				", day=" + day +
				'}';
	}
}
