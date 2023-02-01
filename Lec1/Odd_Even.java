package Lec1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 6) {
			System.out.println("Hello");
		}
		if (n % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}

	}

}
