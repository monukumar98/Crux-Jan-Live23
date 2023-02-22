package Lec7;

public class Fun_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 9;
		int b = 7;
		int c = a + b;
		Add();// calling
		System.out.println(c);

	}

	public static void Add() {

		int a = 11;
		int b = 17;
		int c = a + b;
		Sub();
		System.out.println(c);

	}

	public static void Sub() {

		int a = 11;
		int b = 17;
		int c = a - b;
		Add();
		System.out.println(c);

	}

}
