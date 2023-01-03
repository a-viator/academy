package by.academy.homework3;

public class Receipt {

	public static void printReceipt(Deal deal) {

		if (deal.calcTotalPrice(deal.getBucket()) == 0) {
			System.out.println("До свидания!");
		} else {
			System.out.printf("---------------------------------------%n");
			System.out.printf("%-16s%1s%16s%n", "|", "RECEIPT", "|");
			System.out.printf("---------------------------------------%n");
			int number = 1;
			for (Product product : deal.getBucket()) {
				if (product != null) {
					System.out.printf("| %2s | %-13s | %5s | %6s |%n", number, product.getName(), product.getQuantity(), product.getPrice());
					number++;
				}
			}
			System.out.printf("---------------------------------------%n");
			System.out.printf("%-24s%14s%n", "Итоговая стоимость:", deal.calcTotalPrice(deal.getBucket()));
			System.out.printf("---------------------------------------%n");
			Date.date();
			System.out.printf("---------------------------------------%n");
			deal.deadLineDate();
			System.out.println("Благодарим за покупку!");
		}
	}
}
