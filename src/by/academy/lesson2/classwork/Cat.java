package by.academy.lesson2.classwork;

public class Cat {
	private String nickname;                        //кличка кота
	private int age;                                //возраст кота
	private double money;                           //количество денег

//	private double earnings;                        //деньги, заработанные за разведение
//	private double expenses;                        //траты на кота

	private char initials;                          //инициалы клички кота
	private boolean isHomeAnimal;                   //является ли кошка домашней

	public Cat() {
		//конструктор без параметров
	}

	public Cat(String nickname, int age) {          //конструктор, с параметрами кличка и возраст
		this.nickname = nickname;
		this.age = age;
	}

	public void grow() {                            //метод, который добавляет один год к возрасту кота
		age++;
	}

	public void sleep() {                           //метод вывода на консоль надписи
		System.out.println(nickname + " спит");
	}

	public void eat() {
		System.out.println(nickname + " ест");
	}

	public void walk() {
		System.out.println(nickname + " гуляет");
	}

	public String getNickname() {                   //метод затребования клички кота
		return nickname;
	}

	public void setNickname(String nickname) {      //метод задачи клички кота
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
}
