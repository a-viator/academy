package by.academy.homework4.task1;

public class DateValidator {

	public static boolean validate(String inputDate) {

		if (inputDate.matches("([0-2][0-9]||3[0-1])-(0[0-9]||1[0-2])-((19|20)\\d\\d)")) {
			return true;
		} else {
			System.out.println("Введите дату в формате \"dd-MM-yyyy\": ");
			return false;
		}
	}
}