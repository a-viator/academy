package by.academy.homework3;

import java.time.LocalDate;

public class Deal {

	Person seller;
	Person buyer;

	Deal(Person seller, Person buyer) {
		this.seller = seller;
		this.buyer = buyer;
	}

	//Добавляет предметы в корзину, пересчитывая стоимость отдельных позиций с учётом количества и скидки
	public static void addToBucket(int index, double quantity, Product[] products, Product[] bucket) {

		if (products[index] instanceof Shoes) {
			if (quantity > products[index].getQuantity()) {
				System.out.println("В магазине осталось " + products[index].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Shoes((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Shoes) products[index]).getSize());
						bucket[i].setQuantity(quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
		if (products[index] instanceof Paint) {
			if (quantity > products[index].getQuantity()) {
				System.out.println("В магазине осталось " + products[index].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Paint((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Paint) products[index]).getColor());
						bucket[i].setQuantity(quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
		if (products[index] instanceof Electronics) {
			if (quantity > products[index].getQuantity()) {
				System.out.println("В магазине осталось " + products[index].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Electronics((products[index]).getName(), (products[index]).getQuantity(),
								(products[index]).getPrice(), ((Electronics) products[index]).getVoltage());
						bucket[i].setQuantity(quantity);
						products[index].setQuantity(products[index].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
	}

	//Удаляет предметы из корзины, пересчитывая стоимость отдельных позиций с учётом количества и скидки
	public static void removeFromBucket(int index, double quantity, Product[] products, Product[] bucket) {

		if (bucket[index] == null) {
			System.out.println("В корзине нет продукта с таким индексом");
		} else {
			if (bucket[index] instanceof Shoes) {
				if (quantity > bucket[index].getQuantity()) {
					System.out.println("В корзине " + bucket[index].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index] != null && bucket[index].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index].setQuantity(bucket[index].getQuantity() - quantity);
							bucket[index].setPrice(product.getPrice());
							bucket[index].setPrice((bucket[index]).calcSubTotalPrice());
							break;
						}
					}
				}
			}
			if (bucket[index] instanceof Paint) {
				if (quantity > bucket[index].getQuantity()) {
					System.out.println("В корзине " + bucket[index].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index] != null && bucket[index].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index].setQuantity(bucket[index].getQuantity() - quantity);
							bucket[index].setPrice(product.getPrice());
							bucket[index].setPrice((bucket[index]).calcSubTotalPrice());
							break;
						}
					}
				}
			}
			if (bucket[index] instanceof Electronics) {
				if (quantity > bucket[index].getQuantity()) {
					System.out.println("В корзине " + bucket[index].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index] != null && bucket[index].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index].setQuantity(bucket[index].getQuantity() - quantity);
							bucket[index].setPrice(product.getPrice());
							bucket[index].setPrice((bucket[index]).calcSubTotalPrice());
							break;
						}
					}
				}
			}
		}
	}

	//Печатает и Списывает/Зачисляет деньги, если у покупателя их досточно
	public static void enoughMoney(Person seller, Person buyer, Product[] bucket) {
		if (buyer.getMoney() > Product.calcTotalPrice(bucket)) {
			seller.setMoney(seller.getMoney() + Product.calcTotalPrice(bucket));
			buyer.setMoney(buyer.getMoney() - Product.calcTotalPrice(bucket));
			Receipt.printReceipt(bucket);
		} else {
			System.out.println("Недостаточно средств");
		}
	}

	public static void deadLineDate() {
		System.out.println("Dead line: " + LocalDate.now().plusDays(10));
	}
}
