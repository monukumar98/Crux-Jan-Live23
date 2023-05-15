package Lec35;

public class Student {
	String name;// class ka data/Variable
	int age;// class ka data/Variable
//	static int count;

	public void Intro_yourSelf() {// class ka method ya function

		System.out.println("My Name is " + this.name + " and age is " + age);

	}

	public void SayHey(String name) {
		fun();
		System.out.println(name + " say hey " + this.name);

	}

	public static void fun() {
		// System.out.println(count);

		System.out.println("I am in Fun");
	}

	static {
		System.out.println("Bklol Tinder use nhi krna hai ");
	}
	static {
		System.out.println("Hey All Welcome to Coding Blocks");
	}

}
