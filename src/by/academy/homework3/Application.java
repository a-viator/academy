package by.academy.homework3;

public class Application {

	public static void main(String[] args) {

		String number = "+375292610811";

		Product[] products = new Product[12];
		products[0] = new Shoes("Ботинки", 100, 5, 39);
		products[1] = new Shoes("Ботинки", 100, 5, 40);
		products[2] = new Shoes("Ботинки", 100, 5, 41);
		products[3] = new Shoes("Ботинки", 100, 5, 42);
		products[4] = new Paint("Снежка", 100, 3, "белый");
		products[5] = new Paint("Снежка", 100, 3, "чёрный");
		products[6] = new Paint("Снежка", 100, 3, "зелёный");
		products[7] = new Paint("Снежка", 100, 3, "синий");
		products[8] = new Electronics("Фен", 100, 10, 220);
		products[9] = new Electronics("Фен", 100, 9, 110);
		products[10] = new Electronics("Духовка", 100, 10, 380);
		products[11] = new Electronics("Микроволновка", 100, 10, 220);

		Product[] busket = new Product[12];
	}
}
