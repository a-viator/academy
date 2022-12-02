/*
 * Задание 6
 *
 * Задать промежуток времени в секундах в виде переменной.
 * Следует вывести его на экран в виде часов минут и секунд, суток и недель.
 */

package by.academy.training_manual;

public class Task6 {

	public static void main(String[] args) {

		int s = 60479900;                       //604_800 секунд - 7 суток
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;


		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 7;

		System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд.");
	}
}
