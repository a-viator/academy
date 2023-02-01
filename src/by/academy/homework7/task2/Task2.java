/*
 * Задача 2. Reflection API.
 *
 * Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
 * Добавить класс User, который наследуется от Person, с полями: login, password, email
 * Добавить гетеры, сетеры. Добавить метод printUserInfo в User.
 * Вывести с помощью рефлексии все поля и методы, сначала через
 *
 * getMethod("name")
 * getMethods()
 * getField("name")
 * getFields()
 *
 * а затем через
 *
 * getDeclaredMethod("name")
 * getDeclaredMethods()
 * getDeclaredField("name")
 * getDeclaredFields()
 *
 * Посмотреть разницу.
 * Просетать все значения через Reflection. (set метод класса Field).
 * Вывести значения полей через Reflection. (get метод класса Field).
 * Вызвать toString через invoke.
 *
 */

package by.academy.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

		User user = new User
				("Vincent", "V", LocalDate.of(2000, Month.JUNE, 10),
						"StreetKid", "Cyberpunk2077", "v.streetkid@nightcity.com");

		user.printUserInfo();

		try {
			Class<User> userClass = User.class;

			System.out.println("getMethod(\"name\")");
			System.out.println(userClass.getMethod("printUserInfo"));                  //getMethod("name")
			System.out.println("getDeclaredMethod(\"name\")");
			System.out.println(userClass.getDeclaredMethod("printUserInfo"));          //getDeclaredMethod("name")

			System.out.println("getMethods()");
			System.out.println(Arrays.toString(userClass.getMethods()));                     //getMethods()
			System.out.println("getDeclaredMethods()");
			System.out.println(Arrays.toString(userClass.getDeclaredMethods()));             //getDeclaredMethods()

			System.out.println("getField(\"name\")");
//			System.out.println(userClass.getField("login"));                                 //getField("name")
			System.out.println("getDeclaredField(\"name\")");
			System.out.println(userClass.getDeclaredField("login"));                   //getDeclaredField("name")

			System.out.println("getFields()");
			System.out.println(Arrays.toString(userClass.getFields()));                      //getFields()
			System.out.println("getDeclaredFields()");
			System.out.println(Arrays.toString(userClass.getDeclaredFields()));              //getDeclaredFields()

			Field userFirstName = userClass.getField("firstName");
			userFirstName.set(user, "Johnny");

			Field userLastName = userClass.getField("lastName");
			userLastName.set(user, "Silverhand");

			Field userDateOfBirth = userClass.getField("dateOfBirth");
			userDateOfBirth.set(user, LocalDate.of(1988, Month.NOVEMBER, 16));

			Field userAge = userClass.getField("age");
			userAge.set(user, Period.between
					(LocalDate.of(1988, Month.NOVEMBER, 16), LocalDate.now()).getYears());

			Field userLogin = userClass.getDeclaredField("login");
			userLogin.setAccessible(true);
			userLogin.set(user, "SilverJohnny");

			Field userPassword = userClass.getDeclaredField("password");
			userPassword.setAccessible(true);
			userPassword.set(user, "Cyberpunk2@77");

			Field userEmail = userClass.getDeclaredField("email");
			userEmail.setAccessible(true);
			userEmail.set(user, "johnny.silverhand@gmail.com");

			Method info = userClass.getDeclaredMethod("printUserInfo");
			info.invoke(user);

		} catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
