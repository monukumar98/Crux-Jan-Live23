package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Inverted_HoursGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 1;
		while (row <= 2 * n + 1) {
			// star
			int val=n;
			int i = 1;
			while (i <= star) {
				System.out.print(val+" ");
				i++;
				val--;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			val++;
			if(row==n+1) {
				k=2;
				val++;
			}
			while (k <= star) {
				System.out.print(val+" ");
				val++;
				k++;
			}
			if (row <= n) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
			row++;
			System.out.println();

		}

	}

}
