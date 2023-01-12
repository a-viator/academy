package by.academy.homework4.task1;

public class DateValidator {

	public static boolean validate(String inputDate) {

		if (inputDate.matches("^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$")) {
			return true;
		} else {
			System.out.println("Введите дату в формате \"dd-MM-yyyy\": ");
			return false;
		}
	}
}