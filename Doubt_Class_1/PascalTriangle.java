package Doubt_Class_1;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row < n) {

			int i = 0;
			int ncr = 1;
			while (i < star) {
				System.out.print(ncr + " ");
				ncr = (ncr * (row - i)) / (i + 1);
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
