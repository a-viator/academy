/*
 * Задание 3
 *
 * Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
 * В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
 * Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
 * Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
 * Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
 */

package by.academy.homework6.task3;

import java.io.*;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IOException {

		ArrayList<User> users = new ArrayList<>(10);

		users.add(new User("Антон", "Иванов", 45));
		users.add(new User("Борис", "Фролов", 73));
		users.add(new User("Аккакий", "Данилов", 56));
		users.add(new User("Владислав", "Крылов", 18));
		users.add(new User("Евгений", "Пупкин", 25));
		users.add(new User("Владимир", "Котов", 43));
		users.add(new User("Никита", "Гагарин", 32));
		users.add(new User("Аркадий", "Петров", 37));
		users.add(new User("Андрей", "Макаров", 24));
		users.add(new User("Василий", "Бобров", 90));

		File dir = new File("src/by/academy/homework6/task3", "users");
		if (!dir.exists()) {
			//noinspection ResultOfMethodCallIgnored
			dir.mkdirs();
		}

		//Serialization

		for (User user : users) {
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream
					("src/by/academy/homework6/task3/users/" + user.getName() + "_" + user.getSurname() + ".txt"))) {
				objectOutputStream.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		File[] files = dir.listFiles();

		//Deserialization

		for (File file : files) {
			try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
				User user = (User) objectInputStream.readObject();
				System.out.println(user);
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
