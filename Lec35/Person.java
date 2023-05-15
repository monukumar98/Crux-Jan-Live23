package Lec35;

public class Person {
	String name = "Anish";
	int age = 22;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);
	}

	public void Fun() {
		System.out.println("Hey fun");
	}

	public Person() {

	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;

	}

	public static void main(String[] args) {
		Person p = new Person(78, "Raj");
		p.Intro_yourSelf();
	}
}
