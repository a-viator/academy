package by.academy.homework3;

public class Check {

	public static void calcTotalPrice(Product[] bucket) {
		double totalPrice = 0;
		for (int i = 0; i < bucket.length; i++) {
			if (bucket[i] != null) {
				totalPrice += bucket[i].getPrice();
			}
		}
		System.out.println(totalPrice);
	}
}
