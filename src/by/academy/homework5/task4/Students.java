package by.academy.homework5.task4;

public class Students {

	String name;
	int grade;

	public Students() {
		super();
	}

	public Students(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	@SuppressWarnings("unused")
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "'" + name + '\'' +
				", с оценкой: " + grade;
	}
}
