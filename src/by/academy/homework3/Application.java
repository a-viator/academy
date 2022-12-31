package by.academy.homework3;

public class Application {

	public static void main(String[] args) {

		Person seller = new Person("Shop", 10000);
		Person buyer = new Person("Customer", 10000);

		Product[] products = new Product[12];
		products[0] = new Shoes("Ботинки", 10, 5, 39);
		products[1] = new Shoes("Ботинки", 10, 5, 40);
		products[2] = new Shoes("Ботинки", 10, 5, 41);
		products[3] = new Shoes("Ботинки", 100, 5, 42);
		products[4] = new Paint("Снежка", 100, 3, "белый");
		products[5] = new Paint("Снежка", 100, 3, "чёрный");
		products[6] = new Paint("Снежка", 100, 3, "зелёный");
		products[7] = new Paint("Снежка", 100, 3, "синий");
		products[8] = new Electronics("Фен", 100, 10, 220);
		products[9] = new Electronics("Фен", 100, 9, 110);
		products[10] = new Electronics("Духовка", 100, 10, 380);
		products[11] = new Electronics("Микроволновка", 100, 10, 220);

		Product[] bucket = new Product[products.length];

		Deal.addToBucket(0, 10, products, bucket);
		Deal.addToBucket(1, 10, products, bucket);
		Deal.addToBucket(2, 10, products, bucket);
		Deal.addToBucket(4, 5, products, bucket);
		Deal.addToBucket(4, 5, products, bucket);
		Deal.addToBucket(10, 10, products, bucket);
		Deal.addToBucket(5, 10, products, bucket);
		Deal.addToBucket(6, 10, products, bucket);
		Deal.addToBucket(7, 10, products, bucket);
		Deal.addToBucket(8, 5, products, bucket);
		Deal.addToBucket(9, 100, products, bucket);
		Deal.addToBucket(11, 100, products, bucket);

		for (Product i : products) {
			System.out.println(i);
		}

		System.out.println("______________________________________________________________");

		int i = 0;
		while (bucket[i] != null) {
			System.out.println(bucket[i]);
			i++;
		}

		Deal.removeFromBucket(0, 1, products, bucket);

		for (Product j : products) {
			System.out.println(j);
		}

		System.out.println("______________________________________________________________");

		while (bucket[i] != null) {
			System.out.println(bucket[i]);
			i++;
		}
		Deal.enoughMoney(seller, buyer, bucket);
		System.out.println(seller.getMoney());
		System.out.println(buyer.getMoney());
	}
}
