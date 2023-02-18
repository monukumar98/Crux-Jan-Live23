package Doubt_Class_1;

import java.util.Scanner;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print(a + " ");
				int c = b + a;
				a = b;
				b = c;
				i++;
			}
			star++;
			row++;
			System.out.println();

		}
	}

}
