package by.academy.lesson3.classwork;

public class Task4 {

	public static void main(String[] args) {

//		int s = 5;
//
//		if (s % 2 == 0) {
//			System.out.println("чётное");
//		} else {
//			System.out.println("не чётное");
//		}

//		int s = 370_000;
//		int sec;
//		int m;
//		int min;
//		int h;
//
//		sec = s % 60;
//		m = (s - sec) / 60;
//		min = m % 60;
//		h = (m - min) / 60;
//		System.out.println(h + "часов" + min + "минут" + sec + "секунд");

		int s = 370_000_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;
		int week;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 4;
		week = w % 52;
		System.out.println(week + "недель" + day + "дней" + hour + "часов" + min + "минут" + sec + "секунд");
	}
}
