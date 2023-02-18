package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int k = n;
		while (row <= n) {
			// start
			int i = 1;
			int val = n;
			while (i <= star) {
				if (i == k) {
					System.out.print("* ");
				} else {
					System.out.print(val + " ");
				}

				i++;
				val--;
			}
			row++;
			k--;
			System.out.println();
		}
	}

}
