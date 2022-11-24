package by.academy.lesson2.classwork;

public class Application {
	public static void main(String[] args) {

		Cat cat0 = new Cat("Карри", 3);
		Cat cat1 = new Cat();

		cat0.eat();                                                                //вызов методов
		cat0.sleep();
		cat0.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();
		cat1.setNickname("Матроскин");                                             //задал кличку безымянному коту
		System.out.println(cat1.getNickname() + "\n" + cat1.getAge() + " года");   //затребовал возраст и кличку безымянного кота
		cat1.eat();
	}
}