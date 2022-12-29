package by.academy.homework3;

import java.time.LocalDate;

public class Deal {

	private Person seller = new Person("Shop", 10000);
	private Person buyer = new Person("Customer", 10000);


	public static void addToBasket(int index, double quantity, Product[] products, Product[] basket) {
		if (products[index] instanceof Shoes) {
			for (int j = 0; j < basket.length; j++) {
				for (int i = j + 1; i < basket.length; i++) {
					if (basket[i].getName() != null && basket[i].getName().equals(products[index].getName()) &&
							((Shoes) basket[i]).getSize() == (((Shoes) products[index]).getSize())) {
						basket[i].setQuantity(basket[i].getQuantity() + quantity);
					} else if (basket[i] == null) {
						basket[i] = new Shoes((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Shoes) products[index]).getSize());
						basket[i].setQuantity(quantity);
						if (basket[i].getQuantity() < (products[index]).getQuantity()) {
							products[index].setQuantity(products[index].getQuantity() - quantity);
						} else {
							System.out.println("В магазине нет столько ботинок");
						}
					}
				}
			}
		}
		if (products[index] instanceof Paint) {
			for (int j = 0; j < basket.length; j++) {
				for (int i = j + 1; i < basket.length; i++) {
					if (basket[i].getName() != null && basket[i].getName().equals(products[index].getName()) &&
							((Paint) basket[i]).getColor().equals(((Paint) products[index]).getColor())) {
						basket[i].setQuantity(basket[i].getQuantity() + quantity);
					} else if (basket[i] == null) {
						basket[i] = new Paint((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Paint) products[index]).getColor());
						basket[i].setQuantity(quantity);
						if (basket[i].getQuantity() < (products[index]).getQuantity()) {
							products[index].setQuantity(products[index].getQuantity() - quantity);
						} else {
							System.out.println("В магазине нет столько краски");
						}
					}
				}
			}
		}
		if (products[index] instanceof Electronics) {
			for (int j = 0; j < basket.length; j++) {
				for (int i = j + 1; i < basket.length; i++) {
					if (basket[i].getName() != null && basket[i].getName().equals(products[index].getName()) &&
							((Electronics) basket[i]).getVoltage() == (((Electronics) products[index]).getVoltage())) {
						basket[i].setQuantity(basket[i].getQuantity() + quantity);
					} else if (basket[i] == null) {
						basket[i] = new Shoes((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Electronics) products[index]).getVoltage());
						basket[i].setQuantity(quantity);
						if (basket[i].getQuantity() < (products[index]).getQuantity()) {
							products[index].setQuantity(products[index].getQuantity() - quantity);
						} else {
							System.out.println("В магазине нет столько товара");
						}
					}
				}
			}
		}
	}

	public static void removeFromBasket(int index, double quantity, Product[] products, Product[] basket) {
		if (basket[index].getQuantity() > quantity) {
			for (int i = 0; i < products.length; i++) {
				if (basket[index].equals(products[i])) {              //переопределить метод
					basket[index].setQuantity(basket[index].getQuantity() - quantity);
					products[i].setQuantity(products[index].getQuantity() + quantity);
				} else {
					;
				}
			}
		} else {
			basket[index] = null;
		}
	}


	LocalDate DeadlineDate = LocalDate.now().plusDays(10);
}
