package by.academy.lesson3.classwork;

public class Task2 {

	public static void main(String[] args) {

		int i = 2;
		int j = 3;
		int k = i + j;
		int f = (j * j) + ((k - 1) * (k - 1));

		k--;

		System.out.println(j + "*" + j + "+" + k + "*" + k + "=" + f);
	}
}
