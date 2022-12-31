package by.academy.homework3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void date() {

		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatDateTime = now.format(formatter);

		System.out.println(formatDateTime);
	}
}
