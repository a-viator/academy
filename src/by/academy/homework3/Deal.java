package by.academy.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal {

	private Person seller;
	private Person buyer;
	private Product[] products;
	private Product[] bucket;

	Deal() {
		super();
	}

	Deal(Person seller, Person buyer, Product[] products, Product[] bucket) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		this.bucket = bucket;
	}

	//Добавляет предметы в корзину, пересчитывая стоимость отдельных позиций с учётом количества и скидки
	public static void addToBucket(int index, double quantity, Product[] products, Product[] bucket) {

		if (products[index - 1] instanceof Shoes) {
			if (quantity > products[index - 1].getQuantity()) {
				System.out.println("В магазине осталось " + products[index - 1].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index - 1])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Shoes((products[index - 1]).getName(), (products[index - 1]).getQuantity(),
								(products[index - 1]).getPrice(), ((Shoes) products[index - 1]).getSize());
						bucket[i].setQuantity(quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
		if (products[index - 1] instanceof Paint) {
			if (quantity > products[index - 1].getQuantity()) {
				System.out.println("В магазине осталось " + products[index - 1].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index - 1])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Paint((products[index - 1]).getName(), (products[index - 1]).getQuantity(),
								(products[index - 1]).getPrice(), ((Paint) products[index - 1]).getColor());
						bucket[i].setQuantity(quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
		if (products[index - 1] instanceof Electronics) {
			if (quantity > products[index - 1].getQuantity()) {
				System.out.println("В магазине осталось " + products[index - 1].getQuantity() + " продуктов данного типа");
			} else {
				boolean isBreak = false;
				for (Product product : bucket) {
					if (product != null && product.equals(products[index - 1])) {
						product.setQuantity(product.getQuantity() + quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						product.setPrice(product.calcSubTotalPrice());
						isBreak = true;
						break;
					}
				}
				for (int i = 0; i < bucket.length; i++) {
					if (isBreak) {
						break;
					} else if (bucket[i] == null) {
						bucket[i] = new Electronics((products[index - 1]).getName(), (products[index - 1]).getQuantity(),
								(products[index - 1]).getPrice(), ((Electronics) products[index - 1]).getVoltage());
						bucket[i].setQuantity(quantity);
						products[index - 1].setQuantity(products[index - 1].getQuantity() - quantity);
						bucket[i].setPrice((bucket[i]).calcSubTotalPrice());
						break;
					}
				}
			}
		}
	}

	//Удаляет предметы из корзины, пересчитывая стоимость отдельных позиций с учётом количества и скидки
	public static void removeFromBucket(int index, double quantity, Product[] products, Product[] bucket) {

		if (bucket[index - 1] == null) {
			System.out.println("В корзине нет продукта с таким индексом");
		} else {
			if (bucket[index - 1] instanceof Shoes) {
				if (quantity > bucket[index - 1].getQuantity()) {
					System.out.println("В корзине " + bucket[index - 1].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index - 1] != null && bucket[index - 1].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index - 1].setQuantity(bucket[index - 1].getQuantity() - quantity);
							bucket[index - 1].setPrice(product.getPrice());
							bucket[index - 1].setPrice((bucket[index - 1]).calcSubTotalPrice());
							if (bucket[index - 1].getQuantity() == 0) {
								bucket[index - 1] = null;
							}
							break;
						}
					}
				}
			}
			if (bucket[index - 1] instanceof Paint) {
				if (quantity > bucket[index - 1].getQuantity()) {
					System.out.println("В корзине " + bucket[index - 1].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index - 1] != null && bucket[index - 1].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index - 1].setQuantity(bucket[index - 1].getQuantity() - quantity);
							bucket[index - 1].setPrice(product.getPrice());
							bucket[index - 1].setPrice((bucket[index - 1]).calcSubTotalPrice());
							break;
						}
					}
				}
			}
			if (bucket[index - 1] instanceof Electronics) {
				if (quantity > bucket[index - 1].getQuantity()) {
					System.out.println("В корзине " + bucket[index - 1].getQuantity() + " продуктов данного типа");
				} else {
					for (Product product : products) {
						if (bucket[index - 1] != null && bucket[index - 1].equals(product)) {
							product.setQuantity(product.getQuantity() + quantity);
							bucket[index - 1].setQuantity(bucket[index - 1].getQuantity() - quantity);
							bucket[index - 1].setPrice(product.getPrice());
							bucket[index - 1].setPrice((bucket[index - 1]).calcSubTotalPrice());
							break;
						}
					}
				}
			}
		}
	}

	//Печатает чек и Списывает/Зачисляет деньги, если у покупателя их досточно
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

	public static void printProductsList(Product[] products) {          //метод печати ассортимента
		System.out.println("Наш ассортимент: ");
		for (int i = 0; i < products.length; i++) {
			System.out.println(i + 1 + ". " + products[i]);
		}
	}


	public static void printBucketList(Product[] bucket) {              //метод печати содержимого корзины

		boolean isNotEmpty = false;
		for (Product product : bucket) {                                //проверка на пустоту корзины
			if (product != null) {
				isNotEmpty = true;
				break;
			}
		}
		if (!isNotEmpty) {
			System.out.println("Корзина пуста");
		} else {
			System.out.println("Покупки в корзине: ");
			for (int i = 0; i < bucket.length; i++) {
				if (bucket[i] != null) {
					System.out.println(i + 1 + ". " + bucket[i]);
				}
			}
		}
	}

	public static void add(Scanner sc, Deal deal) {                     //метод добавления продукта в корзину с консоли
		System.out.println("Введите номер продукта: ");
		int index;
		double quantity;
		index = sc.nextInt();
		System.out.println("Введите колличество продуктов: ");
		quantity = sc.nextDouble();
		Deal.addToBucket(index, quantity, deal.getProducts(), deal.getBucket());
	}

	public static void remove(Scanner sc, Deal deal) {                  //метод удаления продукта из корзины с консоли
		System.out.println("Введите номер продукта для удаления: ");
		int index;
		double quantity;
		index = sc.nextInt();
		System.out.println("Введите колличество продуктов: ");
		quantity = sc.nextDouble();
		Deal.removeFromBucket(index, quantity, deal.getProducts(), deal.getBucket());
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public Product[] getBucket() {
		return bucket;
	}
}
