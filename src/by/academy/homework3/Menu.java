package by.academy.homework3;

import java.util.Scanner;

public class Menu {

	public static void startMenu(Scanner sc, Deal deal) {
		System.out.println("Добро пожаловать в наш магазин!");
		while (true) {
			System.out.println("Нажмите: ");
			System.out.println("1. Чтобы посмотреть перечень товаров");
			System.out.println("2. Чтобы выбрать товар");
			System.out.println("3. Чтобы удалить товар из корзины");
			System.out.println("4. Посмотреть товары в корзине");
			System.out.println("0. Чтобы завершить покупки");
			int choice = sc.nextInt();
			switch (choice) {
				case 1 -> deal.printProductsList(deal.getProducts());
				case 2 -> deal.add(sc, deal);
				case 3 -> {
					deal.printBucketList(deal.getBucket());
					deal.remove(sc, deal);
				}
				case 4 -> deal.printBucketList(deal.getBucket());
				case 0 -> {
					deal.enoughMoney(deal);
					return;
				}
				default -> System.out.println("Обратитесь к администратору а помощью");
			}
		}
	}
}
