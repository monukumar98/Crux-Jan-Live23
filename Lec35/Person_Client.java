package Lec35;

import Lec36.Car;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("hey");
		// Person p1 = new Person();
		Person p = new Person(19, "Smridhi");
		Person p1 = new Person(19, "Mohini");
		p.Intro_yourSelf();
		// constructor
		Car c = new Car("Red", 801, 9);
		//c.color="black";
		
		
		p1.Fun();
	}

}
